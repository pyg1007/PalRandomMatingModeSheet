package com.example.palwordrandommatingmodesheet.viewmodel

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.palwordrandommatingmodesheet.usecase.PalInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class PalInfoViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val palInfoUseCase: PalInfoUseCase
) : ViewModel() {

    val test = flow {
        emit(palInfoUseCase())
    }.catch {
        Log.e("viewModels", it.stackTrace.toString())
    }


}