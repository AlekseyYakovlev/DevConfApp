package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import ru.spb.yakovlev.androidacademy.devconfapp.common.Schedulable

@Entity
data class FestActivity(
    @SerializedName("title")
    val title: String,
    @SerializedName("time")
    override val time: String,
    override val longTime: Long? = null
) : Schedulable