package com.example.imagefinder.ui;

import com.example.imagefinder.repository.AppRepository2;
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
public final class ImageViewModel2_Factory implements Factory<ImageViewModel2> {
  private final Provider<AppRepository2> appRepositoryProvider;

  public ImageViewModel2_Factory(Provider<AppRepository2> appRepositoryProvider) {
    this.appRepositoryProvider = appRepositoryProvider;
  }

  @Override
  public ImageViewModel2 get() {
    return newInstance(appRepositoryProvider.get());
  }

  public static ImageViewModel2_Factory create(Provider<AppRepository2> appRepositoryProvider) {
    return new ImageViewModel2_Factory(appRepositoryProvider);
  }

  public static ImageViewModel2 newInstance(AppRepository2 appRepository) {
    return new ImageViewModel2(appRepository);
  }
}
