package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Schedule(
    @SerializedName("talks")
    val talks: List<Talk>,
    @SerializedName("festActivities")
    val festActivities: List<FestActivity>
)