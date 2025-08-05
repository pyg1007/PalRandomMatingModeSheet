package com.example.palwordrandommatingmodesheet.usecase

import com.example.palwordrandommatingmodesheet.repository.PalInfoRepository
import javax.inject.Inject

class PalInfoUseCase @Inject constructor(
    private val repository: PalInfoRepository
){
    suspend operator fun invoke(){
        repository.load()
    }
}