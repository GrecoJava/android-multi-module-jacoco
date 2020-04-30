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
buildscript {
    val kotlin_version by extra("1.3.72")
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
