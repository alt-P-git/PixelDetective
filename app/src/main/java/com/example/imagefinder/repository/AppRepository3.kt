package com.example.imagefinder.repository

import com.example.imagefinder.api.ApiService3
import com.example.imagefinder.model.ChatCompletionRequest
import javax.inject.Inject

class AppRepository3
@Inject constructor(private val apiService3: ApiService3) {
    suspend fun writeAINotice(chatCompletionRequest: ChatCompletionRequest)=apiService3.writeAINotice(chatCompletionRequest)
}