package com.example.imagefinder.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imagefinder.BuildConfig
import com.example.imagefinder.model.ChatCompletionRequest
import com.example.imagefinder.model.Message
import com.example.imagefinder.model.WriteAINoticeResponse
import com.example.imagefinder.repository.AppRepository3
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ImageViewModel3
@Inject constructor(private val appRepository: AppRepository3) : ViewModel() {
    private val writeAINoticeResponse = MutableLiveData<String>()
    val writeAINoticeResponseData: MutableLiveData<String>
        get() = writeAINoticeResponse

    private val generativeModel = GenerativeModel(
        modelName = "gemini-1.5-flash",
        apiKey = BuildConfig.GEMINI_API_KEY
    )

    fun writeAINotice(domain: String, tone: String) {
        var prompt = "Please write a notice to a user requesting the removal of an image owned my me from their social media domain. The image is of me and was posted without my consent on their social media domain which is: $domain in a $tone tone. Only return the Notice and nothing else. If you have any problem, just return ERROR and nothing else."

        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = generativeModel.generateContent(
                    content {
                        text(prompt)
                    }
                )
                response.text?.let { outputContent ->
                    writeAINoticeResponse.postValue(outputContent)
                }
            } catch (e: Exception) {
                writeAINoticeResponse.postValue("ERROR: ${e.localizedMessage ?: ""}")
            }
        }
    }
}