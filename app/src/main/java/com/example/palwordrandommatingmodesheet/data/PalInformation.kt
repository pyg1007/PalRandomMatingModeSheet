package com.example.palwordrandommatingmodesheet.data

data class PalInformation(
    val number: Int,
    val name: String,
    val attribute: String,
    val palValue: Int,
    val amountOfFood: Int,
    val dropItemNumbers: List<Int>
)
