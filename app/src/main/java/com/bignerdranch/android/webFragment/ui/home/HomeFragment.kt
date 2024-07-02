package com.bignerdranch.android.webFragment.ui.home

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import com.bignerdranch.android.application_practica2.databinding.FragmentHomeBinding
import com.bignerdranch.android.webFragment.database.MyData
import com.bignerdranch.android.webFragment.database.MyDataBase
import java.io.ByteArrayOutputStream
import java.io.File

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var ivMyImage: ImageView
    private lateinit var imageUrl: Uri
    private lateinit var db: MyDataBase
    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var buttonSave: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        imageUrl = createImageUri()
        ivMyImage = binding.imageView
        editText = binding.Name
        editText2 = binding.Surname
        editText3 = binding.Group
        buttonSave = binding.buttonSave

        val contract = registerForActivityResult(ActivityResultContracts.TakePicture()) {
            ivMyImage.setImageURI(null)
            ivMyImage.setImageURI(imageUrl)
        }

        ivMyImage.setOnClickListener {
            contract.launch(imageUrl)
        }

        db = MyDataBase.getInstance(requireContext())

        val textView: TextView = binding.Name
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        db.getDbDao().query().asLiveData().observe(viewLifecycleOwner, Observer {
            Log.d("qwe", it.toString())
        })

        buttonSave.setOnClickListener {
            saveDataToDatabase()
        }

        return root
    }

    private fun saveDataToDatabase() {
        val name = editText.text.toString()
        val surname = editText2.text.toString()
        val group = editText3.text.toString()
        val imageBytes = convertImageToBytes(ivMyImage)

        val data = MyData(
            PrimaryKey = 1,
            Image = imageBytes,
            name = name,
            surname = surname,
            group = group
        )

        Thread {
            db.getDbDao().insert(data)
        }.start()
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun createImageUri(): Uri {
        val image = File(requireActivity().filesDir, "myPhoto.png")
        return FileProvider.getUriForFile(
            requireContext(),
            "${requireContext().applicationInfo.packageName}.fileprovider",
            image
        )
    }

    fun convertImageToBytes(imageView: ImageView): ByteArray {
        val bitmap = (imageView.drawable as BitmapDrawable).bitmap
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream)
        return stream.toByteArray()
    }
}
