package ru.spb.yakovlev.androidacademy.devconfapp.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import ru.spb.yakovlev.androidacademy.devconfapp.common.pojos.DevFest

object NetworkDataProvider {
    private val service = ApiFactory.devFestApi
    private val _devFestData by lazy { MutableLiveData<DevFest>() }
    val devFestData:LiveData<DevFest> = _devFestData

    fun updateDevData(){
        GlobalScope.launch(Dispatchers.Main)
        {
            val postRequest = service.fetchDevFestData() // Making Network call
            try {
                val response = postRequest.await()
                if (response.isSuccessful) {
                    _devFestData.postValue(response.body())
                } else {
                    Log.d("NetworkDataProvider ", response.errorBody().toString())
                }
            } catch (e: Exception) {
                Log.d("NetworkDataProvider ", e.toString())
            }
        }
    }


}