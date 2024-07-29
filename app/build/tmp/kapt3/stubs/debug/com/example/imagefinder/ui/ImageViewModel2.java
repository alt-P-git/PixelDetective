package com.example.imagefinder.ui;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/imagefinder/ui/ImageViewModel2;", "Landroidx/lifecycle/ViewModel;", "appRepository", "Lcom/example/imagefinder/repository/AppRepository2;", "(Lcom/example/imagefinder/repository/AppRepository2;)V", "deepfakeResponse", "Landroidx/lifecycle/LiveData;", "Lcom/example/imagefinder/model/DeepfakeDetectionResponse;", "getDeepfakeResponse", "()Landroidx/lifecycle/LiveData;", "fetchDetectDeepfake", "Landroidx/lifecycle/MutableLiveData;", "getDeepfake", "", "videoBase64", "", "requestId", "isIOS", "", "docType", "orientation", "", "app_debug"})
public final class ImageViewModel2 extends androidx.lifecycle.ViewModel {
    private final com.example.imagefinder.repository.AppRepository2 appRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.imagefinder.model.DeepfakeDetectionResponse> fetchDetectDeepfake = null;
    
    @javax.inject.Inject
    public ImageViewModel2(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.repository.AppRepository2 appRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.imagefinder.model.DeepfakeDetectionResponse> getDeepfakeResponse() {
        return null;
    }
    
    public final void getDeepfake(@org.jetbrains.annotations.NotNull
    java.lang.String videoBase64, @org.jetbrains.annotations.NotNull
    java.lang.String requestId, boolean isIOS, @org.jetbrains.annotations.NotNull
    java.lang.String docType, int orientation) {
    }
}