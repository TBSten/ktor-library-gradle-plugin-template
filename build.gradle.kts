plugins {
    alias(libs.plugins.kotlinMultiplatform) apply false
    alias(libs.plugins.vanniktechMavenPublish) apply false
    alias(libs.plugins.kotlinJvm) apply false
    alias(libs.plugins.ktor) apply false
    alias(libs.plugins.binaryCompatibilityValidator) apply false
    alias(libs.plugins.ktlint) apply false
    alias(libs.plugins.buildConventionLint) apply false
    alias(libs.plugins.buildConventionPublish) apply false
}

allprojects {
    // TODO
    group = "com.example.myLibrary"
    version = rootProject.libs.versions.myLibrary.get()
}
