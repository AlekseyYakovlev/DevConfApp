package ru.spb.yakovlev.androidacademy.devconfapp.features.speaker_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations

class GetSpeakersListUseCase (private val repository: UserRepository) {
    suspend operator fun invoke(forceRefresh: Boolean = false, login: String): LiveData<Resource<User>> {
        return Transformations.map(repository.getUserDetailWithCache(forceRefresh, login)) {
            it // Place here your specific logic actions (if any)
        }
    }
}