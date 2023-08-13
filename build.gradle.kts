plugins {
    id("publish-plugin")
}

defaultTasks("build")

rootProject.group = "net.prosavage.factionsx.FactionsX"
rootProject.description = "A high-octane factions experience."
rootProject.version = "1.3"

tasks {
    assemble {
        val jarsDir = File("$rootDir/jars")
        if (jarsDir.exists()) jarsDir.delete()

        subprojects.forEach { project ->
            dependsOn(":${project.name}:build")

            doLast {
                if (!jarsDir.exists()) jarsDir.mkdirs()

                val file = file("${project.buildDir}/libs/${rootProject.name}-${project.version}.jar")

                copy {
                    from(file)
                    into(jarsDir)
                }
            }
        }
    }
}