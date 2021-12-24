package com.plcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class TimeTable(
    val timeId : Int = 1,
    val group : String = "2",
    val teacherName : String = "3",
    val subject : String = "4",
    val room : String = "5"
)