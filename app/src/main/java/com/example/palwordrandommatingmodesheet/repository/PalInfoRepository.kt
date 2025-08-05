package com.example.palwordrandommatingmodesheet.repository

import com.example.palwordrandommatingmodesheet.data.PalInformation

interface PalInfoRepository {
    suspend fun load() : List<PalInformation>
}