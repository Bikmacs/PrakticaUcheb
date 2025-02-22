// Generated by view binder compiler. Do not edit!
package com.bignerdranch.android.application_practica2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bignerdranch.android.application_practica2.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatEditText Group;

  @NonNull
  public final AppCompatEditText Name;

  @NonNull
  public final AppCompatEditText Surname;

  @NonNull
  public final Button buttonSave;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final BottomNavigationView navView;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatEditText Group,
      @NonNull AppCompatEditText Name, @NonNull AppCompatEditText Surname,
      @NonNull Button buttonSave, @NonNull ImageView imageView,
      @NonNull BottomNavigationView navView) {
    this.rootView = rootView;
    this.Group = Group;
    this.Name = Name;
    this.Surname = Surname;
    this.buttonSave = buttonSave;
    this.imageView = imageView;
    this.navView = navView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Group;
      AppCompatEditText Group = ViewBindings.findChildViewById(rootView, id);
      if (Group == null) {
        break missingId;
      }

      id = R.id.Name;
      AppCompatEditText Name = ViewBindings.findChildViewById(rootView, id);
      if (Name == null) {
        break missingId;
      }

      id = R.id.Surname;
      AppCompatEditText Surname = ViewBindings.findChildViewById(rootView, id);
      if (Surname == null) {
        break missingId;
      }

      id = R.id.buttonSave;
      Button buttonSave = ViewBindings.findChildViewById(rootView, id);
      if (buttonSave == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.nav_view;
      BottomNavigationView navView = ViewBindings.findChildViewById(rootView, id);
      if (navView == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, Group, Name, Surname, buttonSave,
          imageView, navView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
