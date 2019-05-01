package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import ru.spb.yakovlev.androidacademy.devconfapp.R
import ru.spb.yakovlev.androidacademy.devconfapp.common.Speaker

class SpeakersAdapter(
    private val values: LiveData<List<Speaker>>
) : RecyclerView.Adapter<SpeakersAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_speaker_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values.value!![position]
        holder.mIdView.text = item.id
        holder.mContentView.text = item.content

        with(holder.view) {
            tag = item
            //setOnClickListener(mOnClickListener)
        }
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    }
}