package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.views

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.databinding.SpeakerItemBinding
import ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.SpeakersViewModel


class CustomAdapter(
    private val speakersViewModel: SpeakersViewModel
) : RecyclerView.Adapter<SpeakerViewHolder>() {

    private val itemsList = mutableListOf<Speaker>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpeakerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = SpeakerItemBinding.inflate(inflater, parent, false)
        return SpeakerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SpeakerViewHolder, position: Int) {
        val item = itemsList[position]
        holder.bind(item)
        holder.itemView.setOnClickListener { v ->
            speakersViewModel.onItemClick(v.context, item)
        }
    }

    override fun getItemCount() = itemsList.size

    fun updateData(newItems: List<Speaker>) {
        val diffCallback = ItemDiffCallback(itemsList, newItems)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        itemsList.clear()
        itemsList.addAll(newItems)
        diffResult.dispatchUpdatesTo(this)
    }
}