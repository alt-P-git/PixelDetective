package com.example.imagefinder.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/imagefinder/repository/AppRepository;", "", "apiService", "Lcom/example/imagefinder/api/ApiService;", "apiService3", "Lcom/example/imagefinder/api/ApiService3;", "(Lcom/example/imagefinder/api/ApiService;Lcom/example/imagefinder/api/ApiService3;)V", "getReverseSearchImages", "Lretrofit2/Response;", "Lcom/example/imagefinder/model/ReverseSearchImageModel;", "image_url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeAINotice", "Lcom/example/imagefinder/model/ChatCompletionResponse;", "chatCompletionRequest", "Lcom/example/imagefinder/model/ChatCompletionRequest;", "(Lcom/example/imagefinder/model/ChatCompletionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AppRepository {
    private final com.example.imagefinder.api.ApiService apiService = null;
    private final com.example.imagefinder.api.ApiService3 apiService3 = null;
    
    @javax.inject.Inject
    public AppRepository(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.api.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.example.imagefinder.api.ApiService3 apiService3) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getReverseSearchImages(@org.jetbrains.annotations.NotNull
    java.lang.String image_url, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.imagefinder.model.ReverseSearchImageModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object writeAINotice(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.model.ChatCompletionRequest chatCompletionRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.imagefinder.model.ChatCompletionResponse>> continuation) {
        return null;
    }
}