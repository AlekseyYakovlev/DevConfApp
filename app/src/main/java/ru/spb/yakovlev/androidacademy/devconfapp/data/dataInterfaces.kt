package ru.spb.yakovlev.androidacademy.devconfapp.data

import androidx.lifecycle.LiveData
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Talk

interface Speakers {
    val speakersList: LiveData<List<Speaker>>
    fun reload()
    fun getSpeakerById(id:String): Speaker?
}

interface Talks {
    val talks: LiveData<List<Talk>>
    fun reload()
    fun getTalkBySpeakerId(speakerId:String): Talk?
}

