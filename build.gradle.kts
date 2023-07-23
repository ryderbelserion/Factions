plugins {
    id("paper-plugin")
    id("kotlin-plugin")
    id("library-plugin")

    id("xyz.jpenilla.run-paper") version "2.0.1"
}

repositories {
    mavenLocal()
    mavenCentral()

    maven("https://repo.maven.apache.org/maven2")

    maven("https://hub.spigotmc.org/nexus/content/groups/public/")

    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots")

    maven("https://repo.dmulloy2.net/nexus/repository/public/")
    maven("https://oss.sonatype.org/content/groups/public/")

    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")

    maven("https://repo.codemc.org/repository/maven-public")


    maven("https://ci.ender.zone/plugin/repository/everything/")

//        maven("https://mavenrepo.cubekrowd.net/artifactory/repo/")

    maven("https://maven.enginehub.org/repo/")

    maven("https://jcenter.bintray.com/")

    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")

    maven("https://ci.ender.zone/plugin/repository/everything/")
    maven("https://minevolt.net/repo/")
    maven("https://repo.citizensnpcs.co/")

    maven("https://nexus.sirblobman.xyz/repository/public/")

    maven("https://jitpack.io")
}

dependencies {
    /*implementation("me.rayzr522:jsonmessage:1.2.1")
    implementation("io.papermc:paperlib:1.0.2")
    implementation("fr.mrmicky:FastParticles:v2.0.0")
    implementation("com.github.MinusKube:SmartInvs:master-SNAPSHOT")
    implementation("com.github.officialrarlab:FastBoard:b6887c9a5f")
    implementation("com.github.officialrarlab:WorldGuardWrapper:1.0")
    implementation("me.oliwer:BossBarAV:1.1")
    compileOnly("com.github.MilkBowl:VaultAPI:1.7")
    compileOnly("net.ess3:EssentialsX:2.17.2")
    compileOnly("me.clip:placeholderapi:2.10.9")
    compileOnly("com.github.brcdev-minecraft:shopgui-api:1.5.0")
    compileOnly("com.github.MyzelYam:SuperVanish:6.2.0") {
        exclude("be.maximvdw")
        exclude("com.comphenix.protocol")
        exclude("net.citizensnpcs")
    }

    compileOnly("com.sk89q.worldguard:worldguard-bukkit:7.0.0")
    compileOnly(files("./lib/FeatherBoard-4.27.0.jar"))
    compileOnly("com.SirBlobman.combatlogx:CombatLogX-API:10.0.0.0-SNAPSHOT")*/
}

tasks {
    reobfJar {
        val file = File("$rootDir/jars")

        if (!file.exists()) file.mkdirs()

        outputJar.set(layout.buildDirectory.file("$file/${rootProject.name}-${rootProject.version}.jar"))
    }

    runServer {
        minecraftVersion("1.19.4")
    }

    processResources {
        filesMatching("plugin.yml") {
            expand(
                "name" to rootProject.name,
                "group" to rootProject.group,
                "version" to rootProject.version,
                "description" to rootProject.description,
                "website" to "https://modrinth.com/plugin/${rootProject.name.lowercase()}"
            )
        }
    }
}