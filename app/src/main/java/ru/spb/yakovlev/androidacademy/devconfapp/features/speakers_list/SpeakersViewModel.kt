package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.Speaker
import ru.spb.yakovlev.androidacademy.devconfapp.data.DataRepo
import ru.spb.yakovlev.androidacademy.testrecyclerviewbinding.utils.toast


class SpeakersViewModel : ViewModel() {
    val speakers: LiveData<List<Speaker>> = DataRepo.speakersList

    fun onItemClick(context: Context?, item: Speaker) {
        context?.toast("U picked ${item.firstName}!")
        // TODO: Replace to open speaker's details
    }
    fun reload(){
        DataRepo.reload()
    }


}