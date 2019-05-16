package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import com.google.gson.annotations.SerializedName

data class Schedule(
    @SerializedName("talks")
    val talks: List<Talk>,
    @SerializedName("festActivities")
    val festActivities: List<FestActivity>
)