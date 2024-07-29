package com.example.imagefinder.di;

import com.example.imagefinder.api.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideRetrofitInstanceFactory implements Factory<ApiService> {
  @Override
  public ApiService get() {
    return provideRetrofitInstance();
  }

  public static AppModule_ProvideRetrofitInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService provideRetrofitInstance() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofitInstance());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideRetrofitInstanceFactory INSTANCE = new AppModule_ProvideRetrofitInstanceFactory();
  }
}
