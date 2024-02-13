plugins {
    kotlin("multiplatform")
    id("com.android.library")
    alias(libs.plugins.composePlugin)
}

kotlin {
    // TODO: Add Desktop Info
    // 1
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = JavaVersion.VERSION_17.toString()
            }
        }
    }
    // 2
    jvm("desktop") {
        compilations.all {
            kotlinOptions.jvmTarget = "17"
        }
    }

    sourceSets {
        val commonMain by getting {
            // 3
            dependencies {
                implementation(project(":shared"))
                api(compose.foundation)
                api(compose.runtime)
                api(compose.material)
                api(compose.material3)
                api(compose.materialIconsExtended)
                api(compose.ui)
                api(compose.uiTooling)
            }
        }
        // 4
        val androidMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
        // 5
        val desktopMain by getting {
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}

android {
    // TODO: Add Android Info
    namespace = "com.misterjvm.findtime.android"
    compileSdk = 34
    defaultConfig {
        minSdk = 26
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
