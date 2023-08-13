plugins {
    id("paper-plugin")
}

version = rootProject.version

repositories {
    flatDir { dirs("libs") }
}

dependencies {
    //implementation(fileTree("libs").include("*.jar"))
}

tasks {
    processResources {
        val props = mapOf(
            "name" to rootProject.name,
            "group" to rootProject.group,
            "version" to project.version,
            "description" to rootProject.description,
            "authors" to rootProject.properties["authors"],
            "apiVersion" to "1.20",
            "website" to "https://modrinth.com/plugin/${rootProject.name.lowercase()}"
        )

        filesMatching("paper-plugin.yml") {
            expand(props)
        }
    }
}