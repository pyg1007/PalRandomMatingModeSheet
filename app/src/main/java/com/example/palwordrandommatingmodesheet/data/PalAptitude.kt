package com.example.palwordrandommatingmodesheet.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "PalWorld")
data class PalAptitude(
    @PrimaryKey(autoGenerate = true) val number: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "fire") val fire: Int,
    @ColumnInfo(name = "water") val water: Int,
    @ColumnInfo(name = "sowing") val sowing: Int,
    @ColumnInfo(name = "lightning") val lightning: Int,
    @ColumnInfo(name = "handmade") val handmade: Int,
    @ColumnInfo(name = "gathering") val gathering: Int,
    @ColumnInfo(name = "felling") val felling: Int,
    @ColumnInfo(name = "mining") val mining: Int,
    @ColumnInfo(name = "pharmaceutical") val pharmaceutical: Int,
    @ColumnInfo(name = "cooling") val cooling: Int,
    @ColumnInfo(name = "conveyance") val conveyance: Int,
    @ColumnInfo(name = "pasture") val pasture: Int
)