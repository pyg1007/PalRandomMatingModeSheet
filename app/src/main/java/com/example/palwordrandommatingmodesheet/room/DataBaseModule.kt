package com.example.palwordrandommatingmodesheet.room

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataBaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(context, PalWorldDatabase::class.java, "PalWorldDatabase").build()


    @Provides
    fun providePalInformationDao(database: PalWorldDatabase) = database.palInformationDao()

}