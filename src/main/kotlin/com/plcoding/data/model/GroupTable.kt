package com.plcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class GroupTable(
    val groupId : Int = 1,
    var raspisanie : ArrayList<DayTable> = arrayListOf(DayTable())
)