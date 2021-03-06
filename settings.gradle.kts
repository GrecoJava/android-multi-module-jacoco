
pluginManagement {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.android.application") {
                useModule("com.android.tools.build:gradle:${requested.version}")
            }
            if (requested.id.id == "com.google.gms.google-services") {
                useModule("com.google.gms:google-services:${requested.version}")
            }
        }
    }
}

rootProject.name = "Android Multi-Module JaCoCo Demo"

include(":app")
include(":mylibraryone")
include(":mylibrarytwo")
include(":mylibrarythree")
