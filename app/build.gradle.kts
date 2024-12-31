import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services") // Firebase plugin

}

android {
    namespace = "com.example.hackverse"
    compileSdk = 35


    defaultConfig {
        applicationId = "com.example.hackverse"
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

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.swiperefreshlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(platform("com.google.firebase:firebase-bom:32.0.0")) // Firebase BOM for version management
    implementation("com.google.firebase:firebase-auth")
    implementation ("de.hdodenhof:circleimageview:3.1.0")// Firebase Authentication

    //Glide Core
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Glide annotation processor (optional, for advanced features like custom models)
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")

    //Realtime Database
    implementation("com.google.firebase:firebase-database:20.2.2")





}


