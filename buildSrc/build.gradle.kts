plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()

    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation("io.papermc.paperweight", "paperweight-userdev", "1.5.5")

    implementation("org.jetbrains.kotlin", "kotlin-gradle-plugin", "1.9.0")

    implementation("io.papermc", "hangar-publish-plugin", "0.0.5")

    implementation("com.github.johnrengelman", "shadow", "8.1.1")

    implementation("com.modrinth.minotaur", "Minotaur", "2.8.2")
}