package com.example.imagefinder.di;

import com.example.imagefinder.api.ApiService2;
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
public final class AppModule2_ProvideRetrofitInstanceFactory implements Factory<ApiService2> {
  @Override
  public ApiService2 get() {
    return provideRetrofitInstance();
  }

  public static AppModule2_ProvideRetrofitInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService2 provideRetrofitInstance() {
    return Preconditions.checkNotNullFromProvides(AppModule2.INSTANCE.provideRetrofitInstance());
  }

  private static final class InstanceHolder {
    private static final AppModule2_ProvideRetrofitInstanceFactory INSTANCE = new AppModule2_ProvideRetrofitInstanceFactory();
  }
}
