package ru.spb.yakovlev.androidacademy.devconfapp.common


import com.google.gson.annotations.SerializedName

data class FestActivity(
    @SerializedName("title")
    val title: String,
    @SerializedName("time")
    override val time: String,
    override val longTime: Long? = null
) : Schedulable