@file: Suppress("SpellCheckingInspection")

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Versions.COMPILE_SDK)

    defaultConfig {
        applicationId = "biz.davidpearson.androidmultimodulejacocodemo"
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)
        versionCode = Versions.APP_VERSION_CODE
        versionName = Versions.APP_VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        unitTests.apply {
            isIncludeAndroidResources = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.txt")
        }
    }

    compileOptions {
        encoding = "UTF-8"
        targetCompatibility = Versions.JAVA_VERSION
        sourceCompatibility = Versions.JAVA_VERSION
    }

    (kotlinOptions as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions).apply {
        jvmTarget = Versions.JAVA_VERSION.toString()
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))


    implementation(Depends.AndroidX.APPCOMPAT)

    implementation(Depends.Google.MATERIAL)

    implementation(Depends.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Depends.AndroidX.Navigation.FRAGMENT)
    implementation(Depends.AndroidX.Navigation.UI)

    testImplementation(Depends.JUNIT)

    androidTestImplementation(Depends.AndroidX.Test.EXT_JUNIT)

    androidTestImplementation(Depends.AndroidX.Test.ESPRESSO_CORE)
}