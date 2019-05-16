package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.views

import androidx.recyclerview.widget.RecyclerView
import ru.spb.yakovlev.androidacademy.devconfapp.common.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.databinding.SpeakerItemBinding

class SpeakerViewHolder(val binding: SpeakerItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(speaker: Speaker) {
        binding.speaker = speaker
        binding.executePendingBindings()
    }
}