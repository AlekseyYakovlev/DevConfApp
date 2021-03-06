package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import com.google.gson.annotations.SerializedName
import ru.spb.yakovlev.androidacademy.devconfapp.common.Schedulable

data class Talk(
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("room")
    val room: Int,
    @SerializedName("track")
    val track: String,
    @SerializedName("speaker")
    val speaker: String,
    @SerializedName("time")
    override val time: String,
    override val longTime: Long? = null
) : Schedulable