package com.example.imagefinder.di;

import com.example.imagefinder.api.ApiService3;
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
public final class AppModule3_ProvideRetrofitInstanceFactory implements Factory<ApiService3> {
  @Override
  public ApiService3 get() {
    return provideRetrofitInstance();
  }

  public static AppModule3_ProvideRetrofitInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ApiService3 provideRetrofitInstance() {
    return Preconditions.checkNotNullFromProvides(AppModule3.INSTANCE.provideRetrofitInstance());
  }

  private static final class InstanceHolder {
    private static final AppModule3_ProvideRetrofitInstanceFactory INSTANCE = new AppModule3_ProvideRetrofitInstanceFactory();
  }
}
