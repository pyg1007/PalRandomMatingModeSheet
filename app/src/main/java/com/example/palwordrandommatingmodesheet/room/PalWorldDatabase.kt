package com.example.palwordrandommatingmodesheet.room

import androidx.room.RoomDatabase


abstract class PalWorldDatabase : RoomDatabase() {
    abstract fun palInformationDao(): PalInformationDao
}