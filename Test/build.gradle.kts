plugins {
    id("maven-publish")
    alias(libs.plugins.android.library)
}

android {
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    namespace = "com.Test"
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        lint.targetSdk = 35
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "io.github.Rishav1995-roy"
            artifactId = "test-library"
            version = "1.0.3"
            // Use assembleRelease to create the AAR
            artifact("${layout.buildDirectory}/outputs/aar/${project.name}-release.aar")
        }
    }
    repositories {
        maven {
            url = uri("file://${rootProject.projectDir}/repo") // Local Maven repo
        }
    }
}