import org.gradle.api.JavaVersion

object Versions {
    const val COMPILE_SDK = 29
    const val MIN_SDK = 16 // was 14
    const val TARGET_SDK = 29
    const val KOTLIN = "1.3.61"


    const val APP_VERSION_CODE = 1
    const val APP_VERSION_NAME = "1.0"

    const val ANDROID_GRADLE_PLUGIN = "3.5.1" // 4.1.0-alpha07
    const val ANDROID_APT = "1.8"
    const val GOOGLE_SERVICES_PLUGIN = "4.3.3"

    const val JACOCO = "0.8.5"

    /**
     * [Dagger](http://jcenter.bintray.com/com/google/dagger/dagger/)
     */
    const val DAGGER = "2.25.4"

    val JAVA_VERSION = JavaVersion.VERSION_1_8


}