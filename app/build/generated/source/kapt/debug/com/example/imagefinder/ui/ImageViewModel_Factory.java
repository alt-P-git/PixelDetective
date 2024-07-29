package com.example.imagefinder.ui;

import com.example.imagefinder.repository.AppRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class ImageViewModel_Factory implements Factory<ImageViewModel> {
  private final Provider<AppRepository> appRepositoryProvider;

  public ImageViewModel_Factory(Provider<AppRepository> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ImageViewModel get() {
    return newInstance(appRepositoryProvider.get());
  }

  public static ImageViewModel_Factory create(Provider<AppRepository> appRepositoryProvider) {
    return new ImageViewModel_Factory(appRepositoryProvider);
  }

  public static ImageViewModel newInstance(AppRepository appRepository) {
    return new ImageViewModel(appRepository);
  }
}
