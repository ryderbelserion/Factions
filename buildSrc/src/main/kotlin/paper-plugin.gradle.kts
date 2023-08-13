plugins {
    id("io.papermc.paperweight.userdev")

    id("publish-plugin")
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    paperweight.paperDevBundle("1.20.1-R0.1-SNAPSHOT")
}

tasks {
    reobfJar {
        outputJar.set(file("$buildDir/libs/${rootProject.name}-${project.version}.jar"))
    }

    assemble {
        dependsOn(reobfJar)
    }
}