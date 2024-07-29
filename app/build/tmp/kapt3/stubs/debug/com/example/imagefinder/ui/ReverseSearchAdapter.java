package com.example.imagefinder.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/imagefinder/ui/ReverseSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/imagefinder/ui/ReverseSearchAdapter$ViewHolder;", "context", "Landroid/content/Context;", "reverseImagesList", "", "Lcom/example/imagefinder/model/Data;", "(Landroid/content/Context;Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ReverseSearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.imagefinder.ui.ReverseSearchAdapter.ViewHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.example.imagefinder.model.Data> reverseImagesList = null;
    
    public ReverseSearchAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.imagefinder.model.Data> reverseImagesList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.example.imagefinder.ui.ReverseSearchAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.imagefinder.ui.ReverseSearchAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f\u00a8\u0006\u0011"}, d2 = {"Lcom/example/imagefinder/ui/ReverseSearchAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/imagefinder/databinding/ItemReverseBinding;", "(Lcom/example/imagefinder/databinding/ItemReverseBinding;)V", "ivImage", "Lcom/makeramen/roundedimageview/RoundedImageView;", "getIvImage", "()Lcom/makeramen/roundedimageview/RoundedImageView;", "tvDomain", "Landroid/widget/TextView;", "getTvDomain", "()Landroid/widget/TextView;", "tvLink", "getTvLink", "tvTitle", "getTvTitle", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.Nullable
        private final android.widget.TextView tvTitle = null;
        @org.jetbrains.annotations.Nullable
        private final android.widget.TextView tvDomain = null;
        @org.jetbrains.annotations.Nullable
        private final android.widget.TextView tvLink = null;
        @org.jetbrains.annotations.Nullable
        private final com.makeramen.roundedimageview.RoundedImageView ivImage = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.example.imagefinder.databinding.ItemReverseBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getTvTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getTvDomain() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.widget.TextView getTvLink() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.makeramen.roundedimageview.RoundedImageView getIvImage() {
            return null;
        }
    }
}