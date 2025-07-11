package com.example.palwordrandommatingmodesheet.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun providePalInfoRepository(palInfoRepositoryImpl: PalInfoRepositoryImpl) : PalInfoRepository
}