@file: Suppress("SpellCheckingInspection")

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

apply(from = "../jacoco.gradle")
apply(from = "codeCoverageReport.gradle")

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
        getByName("debug") {
            isTestCoverageEnabled = true
        }
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

    implementation(project(":mylibraryone"))
    implementation(project(":mylibrarytwo"))
    implementation(project(":mylibrarythree"))

    androidTestImplementation(Depends.AndroidX.Test.ESPRESSO_CORE)
    androidTestImplementation(Depends.AndroidX.Test.EXT_JUNIT)
    implementation(Depends.AndroidX.APPCOMPAT)
    implementation(Depends.AndroidX.CONSTRAINT_LAYOUT)
    implementation(Depends.AndroidX.Navigation.FRAGMENT)
    implementation(Depends.AndroidX.Navigation.UI)
    implementation(Depends.Google.MATERIAL)
    testImplementation(Depends.JUNIT)
}