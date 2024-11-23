import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

// TODO
group = "com.example.mylibrary.buildLogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_17)
    }
}

dependencies {
    implementation(libs.kotlinGradlePlugin)
    implementation(libs.ktlintGradlePlugin)
    implementation(libs.vanniktechMavenPublishGradlePlugin)
}

gradlePlugin {
    plugins {
        register("lint") {
            id = "$group.lint"
            implementationClass = "LintConventionPlugin"
        }
        register("publish") {
            id = "$group.publish"
            implementationClass = "PublishConventionPlugin"
        }
    }
}
