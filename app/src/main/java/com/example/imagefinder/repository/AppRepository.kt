package com.example.imagefinder.repository

import com.example.imagefinder.api.ApiService
import com.example.imagefinder.api.ApiService3
import com.example.imagefinder.model.ChatCompletionRequest
import javax.inject.Inject

class AppRepository
@Inject constructor(private val apiService: ApiService, private val apiService3: ApiService3){
    suspend fun getReverseSearchImages(image_url:String)=apiService.getReverseSearchImages(image_url)

    suspend fun writeAINotice(chatCompletionRequest: ChatCompletionRequest)=apiService3.writeAINotice(chatCompletionRequest)
}