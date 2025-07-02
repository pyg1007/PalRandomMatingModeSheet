package com.example.palwordrandommatingmodesheet.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.palwordrandommatingmodesheet.data.PalInformation
import com.example.palwordrandommatingmodesheet.room.dao.PalInformationDao

@Database(
    entities = [PalInformation::class], version = 1
)
abstract class PalWorldDatabase : RoomDatabase() {
    abstract fun palInformationDao(): PalInformationDao
}