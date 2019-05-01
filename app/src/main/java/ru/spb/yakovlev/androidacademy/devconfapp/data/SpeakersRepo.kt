package ru.spb.yakovlev.androidacademy.devconfapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.spb.yakovlev.androidacademy.devconfapp.common.City
import ru.spb.yakovlev.androidacademy.devconfapp.common.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.common.Talk

object SpeakersRepo : Speakers {

    private val mutableSpeakers = MutableLiveData<List<Speaker>>()
    private val speakersList = mutableListOf<Speaker>()

    override val speakers: LiveData<List<Speaker>>
        get() = mutableSpeakers

    init {
        speakersList.add(
            Speaker(
                "ALEXANDER",
                "EFREMENKOV",
                "System Android developer at Yandex.Taxi",
                City("Moscow", "Russia", ""),
                "",
                "",
                "",
                "",
                Talk(
                    "D8/R8 vs DX/Proguard",
                    1555795001,
                    "Room 1",
                    ""
                )
            )
        )
        speakersList.add(
            Speaker(
                "ALEXANDER0",
                "EFREMENKOV",
                "System Android developer at Yandex.Taxi",
                City("Moscow", "Russia", ""),
                "",
                "",
                "",
                "",
                Talk(
                    "D8/R8 vs DX/Proguard",
                    1555795001,
                    "Room 1",
                    ""
                )
            )
        )
        speakersList.add(
            Speaker(
                "ALEXANDER1",
                "EFREMENKOV",
                "System Android developer at Yandex.Taxi",
                City("Moscow", "Russia", ""),
                "",
                "",
                "",
                "",
                Talk(
                    "D8/R8 vs DX/Proguard",
                    1555795001,
                    "Room 1",
                    ""
                )
            )
        )
        speakersList.add(
            Speaker(
                "ALEXANDER2",
                "EFREMENKOV",
                "System Android developer at Yandex.Taxi",
                City("Moscow", "Russia", ""),
                "",
                "",
                "",
                "",
                Talk(
                    "D8/R8 vs DX/Proguard",
                    1555795001,
                    "Room 1",
                    ""
                )
            )
        )
        speakersList.add(
            Speaker(
                "ALEXANDER3",
                "EFREMENKOV",
                "System Android developer at Yandex.Taxi",
                City("Moscow", "Russia", ""),
                "",
                "",
                "",
                "",
                Talk(
                    "D8/R8 vs DX/Proguard",
                    1555795001,
                    "Room 1",
                    ""
                )
            )
        )
    }



    override fun addSpeaker(speaker: Speaker) {
        speakersList.add(speaker)
        mutableSpeakers.postValue(speakersList)
    }

    override fun deleteSpeaker(speaker: Speaker) {
        val i = speakersList.indexOf(speaker)
        if (i > -1) {
            speakersList.removeAt(i)
            mutableSpeakers.postValue(speakersList)
        }
    }

    override fun reload() {
        mutableSpeakers.postValue(mutableSpeakers.value)
    }
}