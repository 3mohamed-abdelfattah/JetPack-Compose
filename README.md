# JetPack-Compose


This project demonstrates the usage of Jetpack Compose for building Android UIs along with navigation using Navigation Compose.

<img src="https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/1825adb1-c81d-41ca-a09b-04c8405b3b46" alt="image"/>

## Table of Contents

- [Overview](#overview)
- [Dependencies](#dependencies)
- [Screenshots](#screenshots)
- [Resources](#resources)

## Overview

Simple UI - Login - Register - JetPack Compose

## Dependencies

- Jetpack Compose
- Navigation Compose

```gradle
dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")

    implementation(composeBom)
    androidTestImplementation(composeBom)
    // Choose one of the following:
    // Material Design 3
    implementation(libs.material3)
    // or Material Design 2
    implementation(libs.androidx.material)
    // or skip Material Design and build directly on top of foundational components
    implementation(libs.androidx.foundation)
    // or only import the main APIs for the underlying toolkit systems,
    // such as input and measurement/layout
    implementation(libs.ui)
    // Android Studio Preview support
    implementation(libs.ui.tooling.preview)
    debugImplementation(libs.ui.tooling)
    // UI Tests
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.test.manifest)
    // Optional - Included automatically by material, only add when you need
    // the icons but not the material library (e.g. when using Material3 or a
    // custom design system based on Foundation)
    implementation(libs.androidx.material.icons.core)
    // Optional - Add full set of material icons
    implementation(libs.androidx.material.icons.extended)
    // Optional - Add window size utils
    implementation("androidx.compose.material3:material3-window-size-class")
    // Optional - Integration with activities
    implementation(libs.androidx.activity.compose)
    // Optional - Integration with ViewModels
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    // Optional - Integration with LiveData
    implementation(libs.androidx.runtime.livedata)
    // Optional - Integration with RxJava
    implementation(libs.androidx.runtime.rxjava2)
    //Navigation with Compose
    implementation(libs.androidx.navigation.compose)
    implementation(libs.lottie.compose)
    implementation(libs.lottie)
}
```

## Screenshots
Here are some screenshots showcasing the UI App:

<img src="![image](https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/4da21fba-b788-4f41-94cc-565a8715b208)" alt="image" width="300"/>

<img src="mohamed![image](https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/416a9780-d7fb-4950-8365-de2452ee4e2a)" alt="image" width="300"/>

<img src="![image](https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/f48dc3d8-7374-45c6-896b-a34e607051f7)" alt="image" width="300"/>

<img src="![image](https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/ab9302e5-a402-4aab-9281-3a91092b69dd)" alt="image" width="300"/>

<img src="![image](https://github.com/3mohamed-abdelfattah/JetPack-Compose/assets/142848460/a1eab835-4bce-4121-8a93-4d6256e59696)" alt="image" width="300"/>




## Resources
- [Navigation with Compose](https://developer.android.com/develop/ui/compose/navigation#kts)
- [Layouts in Compose](https://developer.android.com/develop/ui/compose/layouts)
- [Jetpack Compose](https://developer.android.com/develop/ui/compose)
- [Material Design 3](https://m3.material.io/develop/android/jetpack-compose)

