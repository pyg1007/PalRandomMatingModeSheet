package com.example.palwordrandommatingmodesheet.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.palwordrandommatingmodesheet.usecase.PalInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PalInfoViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val palInfoUseCase: PalInfoUseCase) : ViewModel() {
}