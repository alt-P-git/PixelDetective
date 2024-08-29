import java.util.Properties

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.imagefinder"
    compileSdk = 34

    dataBinding {
        enable = true
    }

    defaultConfig {

        val keystoreFile = project.rootProject.file("local.properties")
        val properties = Properties()
        properties.load(keystoreFile.inputStream())

        val plagiarismApiKey = properties.getProperty("plagiarismApiKey") ?: ""
        buildConfigField("String", "PLAGIARISM_API_KEY", plagiarismApiKey)
        val deepFakeDetectionToken = properties.getProperty("deepFakeDetectionToken") ?: ""
        buildConfigField("String", "DEEPFAKE_DETECTION_TOKEN", deepFakeDetectionToken)
        val chatGptApiKey = properties.getProperty("chatGptApiKey") ?: ""
        buildConfigField("String", "CHAT_GPT_API_KEY", chatGptApiKey)
        val geminiApiKey = properties.getProperty("geminiApiKey") ?: ""
        buildConfigField("String", "GEMINI_API_KEY", geminiApiKey)
        val oAuthClient = properties.getProperty("oAuthClientId") ?: ""
        buildConfigField("String", "OAUTH_CLIENT", oAuthClient)
        val oAuthDomain = properties.getProperty("oAuthDomain") ?: ""
        buildConfigField("String", "OAUTH_DOMAIN", oAuthDomain)

        applicationId = "com.example.imagefinder"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        manifestPlaceholders += mapOf(
            "auth0Domain" to "dev-0m2h6rhg8jvggqmu.us.auth0.com",
            "auth0Scheme" to "demo"
        )


        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildFeatures{
        viewBinding=true
        dataBinding = true
        buildConfig = true
    }
}
  
dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2024.04.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.ai.client.generativeai:generativeai:0.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2024.04.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    //Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.okhttp3:okhttp:4.11.0")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")

    //Coroutine Lifecycle Scopes
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")

    //Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.48")
    kapt("com.google.dagger:hilt-android-compiler:2.48")
    implementation("androidx.hilt:hilt-work:1.0.0")
    kapt("androidx.hilt:hilt-compiler:1.0.0")
    implementation("androidx.work:work-runtime-ktx:2.8.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    //Coil
    implementation("io.coil-kt:coil:2.4.0")

    implementation ("com.makeramen:roundedimageview:2.3.0")

    //Glide
    implementation ("com.github.bumptech.glide:glide:4.15.0")
    kapt ("com.github.bumptech.glide:compiler:4.12.0")

//    auth0
    implementation ("com.auth0.android:auth0:2.+")
    implementation(kotlin("script-runtime"))
}