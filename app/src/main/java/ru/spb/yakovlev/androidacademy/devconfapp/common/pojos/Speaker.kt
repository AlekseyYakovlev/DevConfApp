package ru.spb.yakovlev.androidacademy.devconfapp.common.pojos


import com.google.gson.annotations.SerializedName

data class Speaker(
    @SerializedName("id")
    val id: String,
    @SerializedName("firstName")
    val firstName: String,
    @SerializedName("lastName")
    val lastName: String,
    @SerializedName("location")
    val location: String,
    @SerializedName(value="jobTitle", alternate= ["job"])
    val jobTitle: String,
    @SerializedName("company")
    val company: String,
    @SerializedName("about")
    val about: String,
    @SerializedName("photo")
    val photo: String,
    @SerializedName("flagImage")
    val flagImage: String,
    @SerializedName("links")
    val links: Links
)