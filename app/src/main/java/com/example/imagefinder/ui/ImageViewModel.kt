package com.example.imagefinder.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imagefinder.model.ChatCompletionRequest
import com.example.imagefinder.model.Message
import com.example.imagefinder.model.ReverseSearchImageModel
import com.example.imagefinder.model.WriteAINoticeResponse
import com.example.imagefinder.repository.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImageViewModel
@Inject constructor(private val appRepository: AppRepository): ViewModel()
{
    private val fetchReverseSearchImages =MutableLiveData<ReverseSearchImageModel>()
    val reverseSearchImageResponse:LiveData<ReverseSearchImageModel>
        get()= fetchReverseSearchImages

    fun getReverseSearchImage(image_url: String) {
        viewModelScope.launch {
            try {
                appRepository.getReverseSearchImages(image_url).let { response ->
                    if (response.isSuccessful) {
                        fetchReverseSearchImages.postValue(response.body())
                    } else {
                        Log.d("ViewModel", "getSearchImageDetails: ${response.errorBody()}")
                    }
                }
            } catch (e: Exception) {
                Log.e("ViewModel", "getReverseSearchImage: ${e.localizedMessage ?: "Unknown error"}")
            }
        }
    }

    /*fun writeAINotice(domain: String) {

    }*/
}