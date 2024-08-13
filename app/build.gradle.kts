plugins {
    alias(libs.plugins.androidApplication)
    id("com.google.gms.google-services")
}



android {
    namespace = "com.example.smart_union"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.smart_union"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.auth)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // UddoktaPay SDK
    implementation ("com.github.uddoktapay:UddoktaPayAndroidSDK:ultra.2.0")
    implementation ("com.squareup.okhttp3:okhttp:5.0.0-alpha.2")







}