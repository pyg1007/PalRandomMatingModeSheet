package com.example.palwordrandommatingmodesheet.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 *
 * number : 펠 번호
 * name : 펠 이름
 * attribute : 펠 속성
 * palValue : 펠 종족값
 * amountOfFood : 식사량
 * dropItemNumbers : 펠 드랍 아이템 번호
 *
 */

@Entity(tableName = "PalInformation")
data class PalInformation(
    @PrimaryKey(autoGenerate = true) val number: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "attribute") val attribute: String,
    @ColumnInfo(name = "palValue") val palValue: Int,
    @ColumnInfo(name = "amountOfFood") val amountOfFood: Int,
    @ColumnInfo(name = "dropItemNumbers") val dropItemNumbers: List<Int> = emptyList<Int>()
)
