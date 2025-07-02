package com.example.palwordrandommatingmodesheet.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.palwordrandommatingmodesheet.data.PalInformation

@Dao
interface PalInformationDao {

    @Query("SELECT * FROM PalInformation")
    suspend fun selectPalInformation(): List<PalInformation>

}