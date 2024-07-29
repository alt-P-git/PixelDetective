package com.example.imagefinder.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/example/imagefinder/ui/DeepfakeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/imagefinder/databinding/ActivityDeepfakeBinding;", "deepfakeDetectionResponse", "Lcom/example/imagefinder/model/DeepfakeDetectionResponse;", "selectedUri", "Landroid/net/Uri;", "viewModel", "Lcom/example/imagefinder/ui/ImageViewModel2;", "getViewModel", "()Lcom/example/imagefinder/ui/ImageViewModel2;", "setViewModel", "(Lcom/example/imagefinder/ui/ImageViewModel2;)V", "checkPermissions", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "openFilePicker", "filePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "processSelectedFile", "uri", "readBytes", "", "inputStream", "Ljava/io/InputStream;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class DeepfakeActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.imagefinder.databinding.ActivityDeepfakeBinding binding;
    private android.net.Uri selectedUri;
    public com.example.imagefinder.ui.ImageViewModel2 viewModel;
    private com.example.imagefinder.model.DeepfakeDetectionResponse deepfakeDetectionResponse;
    @org.jetbrains.annotations.NotNull
    public static final com.example.imagefinder.ui.DeepfakeActivity.Companion Companion = null;
    private static final int PERMISSION_REQUEST_CODE = 1001;
    
    public DeepfakeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.imagefinder.ui.ImageViewModel2 getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.ui.ImageViewModel2 p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean checkPermissions() {
        return false;
    }
    
    private final void openFilePicker(androidx.activity.result.ActivityResultLauncher<android.content.Intent> filePickerLauncher) {
    }
    
    private final void processSelectedFile(android.net.Uri uri) {
    }
    
    private final byte[] readBytes(java.io.InputStream inputStream) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/imagefinder/ui/DeepfakeActivity$Companion;", "", "()V", "PERMISSION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}