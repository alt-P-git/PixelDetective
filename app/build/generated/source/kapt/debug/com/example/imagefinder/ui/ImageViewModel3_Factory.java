package com.example.imagefinder.ui;

import com.example.imagefinder.repository.AppRepository3;
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
public final class ImageViewModel3_Factory implements Factory<ImageViewModel3> {
  private final Provider<AppRepository3> appRepositoryProvider;

  public ImageViewModel3_Factory(Provider<AppRepository3> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ImageViewModel3 get() {
    return newInstance(appRepositoryProvider.get());
  }

  public static ImageViewModel3_Factory create(Provider<AppRepository3> appRepositoryProvider) {
    return new ImageViewModel3_Factory(appRepositoryProvider);
  }

  public static ImageViewModel3 newInstance(AppRepository3 appRepository) {
    return new ImageViewModel3(appRepository);
  }
}
