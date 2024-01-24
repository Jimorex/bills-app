plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")

    // Kapt
    id("kotlin-kapt")
    // Dagger - Hilt
    id ("dagger.hilt.android.plugin")
    // Firebase
    id("com.google.gms.google-services")
}

android {
    namespace = "tech.noir.app.bills"
    compileSdk = 34

    defaultConfig {
        applicationId = "tech.noir.app.bills"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildToolsVersion = "34"
}

dependencies {

    // Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.48.1")
    implementation("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    kapt ("com.google.dagger:hilt-android-compiler:2.48.1")
    implementation ("androidx.hilt:hilt-navigation-compose:1.1.0")
    //

    //Constraint Layout
    implementation ("androidx.constraintlayout:constraintlayout-compose:1.0.1")

    //Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.google.firebase:firebase-analytics")

    //Material Components
    implementation ("com.google.android.material:material:1.11.0")

    //RetroFit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.10.01"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.10.01"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}