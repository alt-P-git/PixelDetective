package com.example.imagefinder.repository;

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
public final class AppRepository3_Factory implements Factory<AppRepository3> {
  private final Provider<ApiService3> apiService3Provider;

  public AppRepository3_Factory(Provider<ApiService3> apiService3Provider) {
    this.apiService3Provider = apiService3Provider;
  }

  @Override
  public AppRepository3 get() {
    return newInstance(apiService3Provider.get());
  }

  public static AppRepository3_Factory create(Provider<ApiService3> apiService3Provider) {
    return new AppRepository3_Factory(apiService3Provider);
  }

  public static AppRepository3 newInstance(ApiService3 apiService3) {
    return new AppRepository3(apiService3);
  }
}
