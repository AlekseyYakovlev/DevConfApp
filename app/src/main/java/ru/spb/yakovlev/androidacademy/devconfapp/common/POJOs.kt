package ru.spb.yakovlev.androidacademy.devconfapp.common

data class Talk(
    val name: String,
    val date: Long,
    val address: String,
    val talkDescription: String,
    val tags: List<Tag>? = null
)

data class Speaker(
    val firstName: String,
    val lastName: String,
    val jobTitle: String,
    val city: City,
    val twitter: String? = null,
    val gitHub: String? = null,
    val about: String,
    val photo: String,
    val talk: Talk
    )

data class Tag(
    val name: String
)

data class City(
    //val id: Int,
    val name: String,
    val country: String,
    val flagPic: String
)

//data class Country(
//    val name: String,
//    val flagPic: String
//)