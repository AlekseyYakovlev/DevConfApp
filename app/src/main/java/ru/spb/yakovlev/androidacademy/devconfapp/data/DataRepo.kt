package ru.spb.yakovlev.androidacademy.devconfapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Talk
import ru.spb.yakovlev.androidacademy.devconfapp.data.network.NetworkDataProvider

object DataRepo : Speakers, Talks {
    private val netDP = NetworkDataProvider

    override val speakersList: LiveData<List<Speaker>>
        get() = Transformations.map(netDP.devFestDataFromNet) { it.speakers }

    override val talks: LiveData<List<Talk>>
        get() = Transformations.map(netDP.devFestDataFromNet) { it.schedule.talks }

    override fun getSpeakerById(id: String): Speaker? =
        speakersList.value?.find { it.id == id }

    override fun getTalkBySpeakerId(speakerId: String): Talk? =
        talks.value?.find { it.speaker == speakerId }

    override fun reload() {
        netDP.updateDevDataFromNet()
    }

}