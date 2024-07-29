package com.example.imagefinder.api

import com.example.imagefinder.BuildConfig
import com.example.imagefinder.model.ChatCompletionRequest
import com.example.imagefinder.model.ChatCompletionResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService3 {
    @Headers("Content-Type: application/json", "Authorization: Bearer ${BuildConfig.CHAT_GPT_API_KEY}")
    @POST("v1/chat/completions")
    suspend fun writeAINotice(@Body request: ChatCompletionRequest): Response<ChatCompletionResponse>
}