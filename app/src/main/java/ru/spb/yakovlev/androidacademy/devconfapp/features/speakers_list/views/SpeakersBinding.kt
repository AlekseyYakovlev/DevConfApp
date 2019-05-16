package ru.spb.yakovlev.androidacademy.devconfapp.features.speakers_list.views

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object SpeakersBinding {

    @BindingAdapter("app:imageUrl")
    @JvmStatic fun loadImage(view: ImageView, url: String) {
        Glide.with(view.context).load(url).apply(RequestOptions.circleCropTransform()).into(view)
    }
}