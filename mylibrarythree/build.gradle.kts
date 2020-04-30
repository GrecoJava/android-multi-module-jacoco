plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

apply(from = "../jacoco.gradle")

android {
    compileSdkVersion(Versions.COMPILE_SDK)

    defaultConfig {
        minSdkVersion(Versions.MIN_SDK)
        targetSdkVersion(Versions.TARGET_SDK)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("debug") {
            isTestCoverageEnabled = true
        }
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        encoding = "UTF-8"
        targetCompatibility = Versions.JAVA_VERSION
        sourceCompatibility = Versions.JAVA_VERSION
    }

    kotlinOptions {
        jvmTarget = Versions.JAVA_VERSION.toString()
    }
}

dependencies {
    androidTestImplementation(Depends.AndroidX.Test.ESPRESSO_CORE)
    androidTestImplementation(Depends.AndroidX.Test.EXT_JUNIT)
    implementation(Depends.AndroidX.APPCOMPAT)
    implementation(Depends.AndroidX.CORE_KTX)
    implementation(Depends.Google.MATERIAL)
    implementation(Depends.Kotlin.STDLIB)
    testImplementation(Depends.JUNIT)
}