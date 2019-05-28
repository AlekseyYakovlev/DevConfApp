package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity
data class Links(

    val speakerId:String?=null,
    @SerializedName("twitter")
    val twitter: String? = null,
    @SerializedName("github")
    val github: String? = null,
    @SerializedName("telegram")
    val telegram: String? = null
)