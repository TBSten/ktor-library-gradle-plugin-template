plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.buildConventionLint)
    alias(libs.plugins.buildConventionPublish)
}

kotlin {}

dependencies {
    implementation(libs.ktorServerCore)
    implementation(libs.ktorServerResources)
    implementation(libs.ktorServerTestHost)
    implementation(libs.ktorServerNetty)
    testImplementation(libs.kotlinTestJunit)
    testImplementation(libs.kotlinxCoroutinesTest)
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

conventionPublish {
    // TODO
    artifactId = "com.example.myLibrary"

    libraryName = "My Library"
    libraryDescription = ""
}
signing {
    if (project.hasProperty("mavenCentralUsername") ||
        System.getenv("ORG_GRADLE_PROJECT_mavenCentralUsername") != null
    ) {
        useGpgCmd()
        // It is not perfect (fails at some dependency assertions), better handled as
        // `signAllPublications()` (as in vanniktech maven publish plugin) at build.gradle.kts.
        // sign(publishing.publications)
    }
}
