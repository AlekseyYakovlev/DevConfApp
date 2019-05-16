package ru.spb.yakovlev.androidacademy.devconfapp.common


import com.google.gson.annotations.SerializedName

data class DevFest(
    @SerializedName("speakers")
    val speakers: List<Speaker>,
    @SerializedName("schedule")
    val schedule: Schedule
)