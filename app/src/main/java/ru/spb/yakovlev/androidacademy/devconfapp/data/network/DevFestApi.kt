package ru.spb.yakovlev.androidacademy.devconfapp.data.network

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.DevFest

interface DevFestApi {
    @GET("data.json")
    fun fetchDevFestData(): Deferred<Response<DevFest>>
}