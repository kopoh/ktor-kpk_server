package com.plcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DayTable(
    val dayId : Int = 1,
    val amount : Int = 7,
    var dayArray : ArrayList<TimeTable> = arrayListOf(TimeTable())
)

