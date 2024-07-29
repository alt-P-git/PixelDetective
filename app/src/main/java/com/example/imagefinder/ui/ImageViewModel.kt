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
            appRepository.getReverseSearchImages(image_url).let { response ->
                if(response.isSuccessful){
                    fetchReverseSearchImages.postValue(response.body())
                }
                else{
                    Log.d("ViewModel","getSearchImageDetails: ${response.errorBody()}")
                }
            }
        }
    }

    private val writeAINoticeResponse = MutableLiveData<WriteAINoticeResponse>()
    val writeAINoticeResponseData: MutableLiveData<WriteAINoticeResponse>
        get() = writeAINoticeResponse

    fun writeAINotice(domain: String) {
        val role = "user"
        val content ="Please write a notice to a user requesting the removal of my image from their social media domain. The image is of me and was posted without my consent on their social media domain which is: $domain."
        val message = Message(role, content)
        val chatCompletionRequest = ChatCompletionRequest("gpt-3.5-turbo", listOf(message), mapOf("return_immediate_response" to "true"))

        viewModelScope.launch {
            try {
                val response = appRepository.writeAINotice(chatCompletionRequest)
                Log.e("ViewModel", "writeAINotice: ${response}")
            } catch (e: Exception) {
                Log.e("ViewModel", "writeAINotice: ${e}")
            }
        }
    }
}