package net.prosavage.factionsx.event

import net.prosavage.factionsx.core.FPlayer
import net.prosavage.factionsx.core.Faction
import org.bukkit.event.Cancellable
import org.bukkit.event.Event
import org.bukkit.event.HandlerList

class FactionPreDisbandEvent(val faction: Faction, val fPlayer: FPlayer?, val isAdmin: Boolean) : Event(false), Cancellable {

    private var cancelled: Boolean = false

    companion object {
        @JvmStatic
        val handlerList = HandlerList()
    }

    override fun getHandlers(): HandlerList = handlerList
    override fun isCancelled(): Boolean = this.cancelled
    override fun setCancelled(shouldCancel: Boolean) {
        this.cancelled = shouldCancel; }
}