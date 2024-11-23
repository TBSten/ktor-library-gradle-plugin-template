plugins {
    alias(libs.plugins.kotlinJvm)
    `java-gradle-plugin`
    alias(libs.plugins.buildConventionLint)
    alias(libs.plugins.buildConventionPublish)
}

sourceSets {}

dependencies {
    implementation(libs.kotlinGradlePlugin)
    implementation(libs.kotlinGradlePluginApi)
}

gradlePlugin {
    plugins {
        // TODO
        create("my-library") {
            id = "com.example.myLibrary"
            implementationClass = "com.example.myLibrary.MyLibraryPlugin"
            displayName = "My Library"
        }
    }
}

conventionPublish {
    // TODO
    artifactId = "my-library-gradle-plugin"

    libraryName = "My Library Gradle Plugin"
    libraryDescription = ""
}
