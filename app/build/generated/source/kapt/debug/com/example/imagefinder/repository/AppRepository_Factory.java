package com.example.imagefinder.repository;

import com.example.imagefinder.api.ApiService;
import com.example.imagefinder.api.ApiService3;
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
public final class AppRepository_Factory implements Factory<AppRepository> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<ApiService3> apiService3Provider;

  public AppRepository_Factory(Provider<ApiService> apiServiceProvider,
      Provider<ApiService3> apiService3Provider) {
    this.apiServiceProvider = apiServiceProvider;
    this.apiService3Provider = apiService3Provider;
  }

  @Override
  public AppRepository get() {
    return newInstance(apiServiceProvider.get(), apiService3Provider.get());
  }

  public static AppRepository_Factory create(Provider<ApiService> apiServiceProvider,
      Provider<ApiService3> apiService3Provider) {
    return new AppRepository_Factory(apiServiceProvider, apiService3Provider);
  }

  public static AppRepository newInstance(ApiService apiService, ApiService3 apiService3) {
    return new AppRepository(apiService, apiService3);
  }
}
