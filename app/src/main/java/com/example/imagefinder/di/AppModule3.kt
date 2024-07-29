package com.example.imagefinder.di

import com.example.imagefinder.api.ApiService3
import com.example.imagefinder.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule3 {
    @Provides
    @Singleton
    fun provideRetrofitInstance(): ApiService3 =
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL3)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService3::class.java)
}