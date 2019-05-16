package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("twitter")
    val twitter: String? = null,
    @SerializedName("github")
    val github: String? = null,
    @SerializedName("telegram")
    val telegram: String? = null
)