package net.prosavage.factionsx.manager

import net.prosavage.factionsx.FactionsX
import net.prosavage.factionsx.persist.IConfigFile
import net.prosavage.factionsx.persist.Message
import net.prosavage.factionsx.persist.config.*
import net.prosavage.factionsx.persist.config.gui.AccessGUIConfig
import net.prosavage.factionsx.persist.config.gui.PermsGUIConfig
import net.prosavage.factionsx.persist.config.gui.UpgradesGUIConfig
import org.bukkit.plugin.java.JavaPlugin

object ConfigFileManager {

    private val plugin = JavaPlugin.getPlugin(FactionsX::class.java)

    fun setup() {
        register(Config)
        register(EconConfig)
        register(RoleConfig)
        register(PermsGUIConfig)
        register(AccessGUIConfig)
        register(ProtectionConfig)
        register(UpgradesConfig)
        register(UpgradesGUIConfig)
        register(MapConfig)
        register(FlyConfig)
        register(ScoreboardConfig)
        register(Message)
    }

    val files = hashSetOf<IConfigFile>()

    fun register(configurableFile: IConfigFile) {
        files.add(configurableFile)
    }

    fun load() {
        files.forEach { it.load(this.plugin) }
    }

    fun save() {
        files.forEach {
            // Load changes first, then save.
            it.load(this.plugin)
            it.save(this.plugin)
        }
    }
}