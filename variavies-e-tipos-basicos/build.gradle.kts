plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.marcusvinciuss"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}