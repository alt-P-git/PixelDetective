package com.example.imagefinder.api

import com.example.imagefinder.BuildConfig
import com.example.imagefinder.model.ReverseSearchImageModel
import com.example.imagefinder.utils.Constants.BASE_URL
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @Headers(
        "X-RapidAPI-Key: ${BuildConfig.PLAGIARISM_API_KEY}",
        "X-RapidAPI-Host: reverse-image-search1.p.rapidapi.com"
    )
    @GET("reverse-image-search")
    suspend fun getReverseSearchImages(
        @Query("url") imageUrl: String,
        @Query("limit") limit: Int = 10
    ): Response<ReverseSearchImageModel>
}
