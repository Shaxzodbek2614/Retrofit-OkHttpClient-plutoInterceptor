plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.retrofitexample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.retrofitexample"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")

    // okhhtp client
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")

    // pluto interceptor
    debugImplementation ("com.mocklets:pluto:1.1.3")
    releaseImplementation ("com.mocklets:pluto-no-op:1.1.3")

}