package com.bignerdranch.android.webFragment.database

import androidx.core.view.WindowInsetsCompat.Type.InsetsType
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface MyDataBaseDao {

    @Insert
    fun insert(vararg data: MyData)

    @Update
    fun update(vararg data: MyData)

    @Query("Select * From MyData")
    fun query(): Flow<List<MyData>>
}