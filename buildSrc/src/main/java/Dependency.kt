object Dependency {
    object Kotlin {
        const val SDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.21"
    }

    object AndroidX {
        const val MATERIAL = "androidx.compose.material:material:1.0.0-rc02"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.0-rc01"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.3.1"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:1.7.0-alpha01"
    }

    object Test {
        const val JUNIT = "junit:junit:4.13.2"
        const val ANDROID_JUNIT_RUNNER = "AndroidJUnitRunner"
    }

    object AndroidTest {
        const val TEST_RUNNER = "androidx.test:runner:1.4.0"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.4.0"
    }
}
