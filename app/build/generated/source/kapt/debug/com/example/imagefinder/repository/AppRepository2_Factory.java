package com.example.imagefinder.repository;

import com.example.imagefinder.api.ApiService2;
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
public final class AppRepository2_Factory implements Factory<AppRepository2> {
  private final Provider<ApiService2> apiService2Provider;

  public AppRepository2_Factory(Provider<ApiService2> apiService2Provider) {
    this.apiService2Provider = apiService2Provider;
  }

  @Override
  public AppRepository2 get() {
    return newInstance(apiService2Provider.get());
  }

  public static AppRepository2_Factory create(Provider<ApiService2> apiService2Provider) {
    return new AppRepository2_Factory(apiService2Provider);
  }

  public static AppRepository2 newInstance(ApiService2 apiService2) {
    return new AppRepository2(apiService2);
  }
}
