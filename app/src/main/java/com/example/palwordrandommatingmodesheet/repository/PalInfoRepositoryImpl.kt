package com.example.palwordrandommatingmodesheet.repository

import com.example.palwordrandommatingmodesheet.data.PalInformation
import com.example.palwordrandommatingmodesheet.room.dao.PalInformationDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PalInfoRepositoryImpl @Inject constructor(
    private val palInformationDao: PalInformationDao
) : PalInfoRepository{
    override suspend fun load() : List<PalInformation> {
        return palInformationDao.selectPalInformation()
    }
}