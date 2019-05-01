package ru.spb.yakovlev.androidacademy.devconfapp.data

import androidx.lifecycle.LiveData
import ru.spb.yakovlev.androidacademy.devconfapp.common.Speaker

interface Speakers {
    val speakers: LiveData<List<Speaker>>
    fun addSpeaker(speaker: Speaker)
    fun deleteSpeaker(speaker: Speaker)
    fun reload()
}

interface Talks {
    val talks: LiveData<List<Speaker>>
    fun addTalk(talk: Talks)
    fun deleteTalk(talk: Talks)
    fun reload()
}

