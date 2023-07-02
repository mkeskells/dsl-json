import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    kotlin("kapt") version "1.8.0"
    application
}

group = "kotlin-dsl-json"
version = "2.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.dslplatform:dsl-json:2.0.0")
    kapt("com.dslplatform:dsl-json:2.0.0")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}