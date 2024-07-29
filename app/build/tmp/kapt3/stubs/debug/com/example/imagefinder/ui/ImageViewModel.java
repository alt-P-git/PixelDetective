package com.example.imagefinder.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/example/imagefinder/ui/ImageViewModel;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/example/imagefinder/repository/AppRepository;", "(Lcom/example/imagefinder/repository/AppRepository;)V", "fetchReverseSearchImages", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/imagefinder/model/ReverseSearchImageModel;", "reverseSearchImageResponse", "Landroidx/lifecycle/LiveData;", "getReverseSearchImageResponse", "()Landroidx/lifecycle/LiveData;", "writeAINoticeResponse", "Lcom/example/imagefinder/model/WriteAINoticeResponse;", "writeAINoticeResponseData", "getWriteAINoticeResponseData", "()Landroidx/lifecycle/MutableLiveData;", "getReverseSearchImage", "", "image_url", "", "writeAINotice", "domain", "app_debug"})
public final class ImageViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.imagefinder.repository.AppRepository appRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.imagefinder.model.ReverseSearchImageModel> fetchReverseSearchImages = null;
    private final androidx.lifecycle.MutableLiveData<com.example.imagefinder.model.WriteAINoticeResponse> writeAINoticeResponse = null;
    
    @javax.inject.Inject
    public ImageViewModel(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.repository.AppRepository appRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.imagefinder.model.ReverseSearchImageModel> getReverseSearchImageResponse() {
        return null;
    }
    
    public final void getReverseSearchImage(@org.jetbrains.annotations.NotNull
    java.lang.String image_url) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.imagefinder.model.WriteAINoticeResponse> getWriteAINoticeResponseData() {
        return null;
    }
    
    public final void writeAINotice(@org.jetbrains.annotations.NotNull
    java.lang.String domain) {
    }
}