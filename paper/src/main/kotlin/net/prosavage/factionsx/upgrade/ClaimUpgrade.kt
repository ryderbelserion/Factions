package net.prosavage.factionsx.upgrade

import net.prosavage.factionsx.FactionsX
import net.prosavage.factionsx.core.FPlayer
import net.prosavage.factionsx.core.Faction
import net.prosavage.factionsx.persist.data.FLocation
import net.prosavage.factionsx.util.SerializableItem
import org.bukkit.plugin.java.JavaPlugin
import kotlin.math.ceil

class ClaimUpgrade(name: String, item: SerializableItem, maxLevelLore: List<String>, costLevel: Map<Int, LevelInfo>)
    : Upgrade(name, item, maxLevelLore, costLevel) {

    private val plugin = JavaPlugin.getPlugin(FactionsX::class.java)

    override val upgradeListener = ClaimUpgradeListener(this.plugin, this)

    override fun executeLevelUp(forFaction: Faction, fLocation: FLocation, upgrader: FPlayer): Boolean {
        val success = super.executeLevelUp(forFaction, fLocation, upgrader)

        if (!success) return false

        val upgradeParamForLevel = getUpgradeParamForLevel(getUpgradeLevelForScope(forFaction, fLocation)) ?: return false

        forFaction.maxClaimBoost += ceil(upgradeParamForLevel).toInt()

        return true
    }

    class ClaimUpgradeListener(override val factionsX: FactionsX, override val upgrade: Upgrade) : UpgradeListener
}