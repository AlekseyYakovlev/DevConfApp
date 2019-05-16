package ru.spb.yakovlev.androidacademy.devconfapp.features.speaker_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Talk

class SpeakerDetailsFragmentViewModel : ViewModel() {
    private val _speakerCard = MutableLiveData<SpeakerCard>()
    val speakerCard: LiveData<SpeakerCard>
        get() = _speakerCard




}

class SpeakerCard(val speaker: Speaker, val talk: Talk)