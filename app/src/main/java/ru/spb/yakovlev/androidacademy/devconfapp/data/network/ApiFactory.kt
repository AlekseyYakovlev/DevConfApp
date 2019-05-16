package ru.spb.yakovlev.androidacademy.devconfapp.data.network

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private fun retrofit(): Retrofit = Retrofit.Builder()
        //.client(OkHttpClient().newBuilder().build())
        .baseUrl("https://storage.yandexcloud.net/devfestapi/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .build()

    val devFestApi: DevFestApi = retrofit().create(DevFestApi::class.java)
}