// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version Versions.ANDROID_GRADLE_PLUGIN apply false
    kotlin("android") version Versions.KOTLIN apply false
    kotlin("android.extensions") version Versions.KOTLIN apply false
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
