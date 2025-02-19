plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//    id("com.google.devtools.ksp")
//    id("androidx.navigation.safeargs.kotlin")
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.devtools.ksp") version "1.9.0-1.0.13"
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.newsappproject"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.newsappproject"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

//    implementation("androidx.core:core-ktx:1.15.0")
//    implementation("androidx.appcompat:appcompat:1.7.0")
//    implementation("com.google.android.material:material:1.12.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.2.0")
//    implementation(libs.firebase.crashlytics.buildtools)
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.2.1")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
//
//    // Architectural Components
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
//    // Room
//    implementation ("androidx.room:room-runtime:2.6.1")
//    ksp ("androidx.room:room-compiler:2.6.1")
//    // Kotlin Extensions and Coroutines support for Room
//    implementation ("androidx.room:room-ktx:2.6.1")
//    // Coroutines
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
//    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
//    // Coroutine Lifecycle Scopes
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
//    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
//    // Retrofit
//    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
//    // Navigation Components
//    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.7")
//    implementation ("androidx.navigation:navigation-ui-ktx:2.8.7")
//    // Glide
//    implementation ("com.github.bumptech.glide:glide:4.12.0")
//    ksp ("com.github.bumptech.glide:compiler:4.12.0")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    // Room
    implementation ("androidx.room:room-runtime:2.6.1")
    ksp ("androidx.room:room-compiler:2.6.1")
    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:2.6.1")
    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")
    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:4.5.0")
    // Navigation Components
    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.7")
    implementation ("androidx.navigation:navigation-ui-ktx:2.8.7")
    // Glide
    implementation ("com.github.bumptech.glide:glide:4.12.0")
    ksp ("com.github.bumptech.glide:compiler:4.12.0")

}