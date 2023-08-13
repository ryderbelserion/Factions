plugins {
    `java-library`
    `maven-publish`

    kotlin("jvm")

    id("com.github.johnrengelman.shadow")
}

dependencies {
    api(kotlin("stdlib"))
}

repositories {
    maven("https://jitpack.io")

    mavenCentral()
}

kotlin {
    jvmToolchain(17)

    sourceSets.all {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of("17"))
}

tasks {
    compileKotlin {
        kotlinOptions {
            jvmTarget = "17"
            javaParameters = true
        }
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(17)
    }
}