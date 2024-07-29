package com.example.imagefinder.api

import com.example.imagefinder.BuildConfig
import com.example.imagefinder.model.DeepfakeDetectionResponse
import com.example.imagefinder.model.DeepfakeRequestBody
import com.example.imagefinder.model.ReverseSearchImageModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService2 {
        @Headers("token: ${BuildConfig.DEEPFAKE_DETECTION_TOKEN}", "content-type: application/json")
        @POST("deepfake-detection")
        suspend fun detectDeepfake(@Body requestBody: DeepfakeRequestBody): Response<DeepfakeDetectionResponse>
}