package net.prosavage.factionsx.scoreboard.implementations

import net.prosavage.factionsx.core.FPlayer
import net.prosavage.factionsx.scoreboard.Scoreboard
import org.bukkit.entity.Player

/**
 * Class to handle the [Scoreboard] implementation of FeatherBoard.
 */
class FeatherBoard : Scoreboard {

    override val type: String = "FeatherBoard"

    override fun show(fPlayer: FPlayer) {
        //val player: Player = fPlayer.getPlayer()!!

        //if (!FeatherBoardAPI.isToggled(player)) toggle(player, true)
        //fPlayer.scoreboardActive = true

        //FeatherBoardAPI.showScoreboard(player, fPlayer.boardTypeAt().toString())
    }

    override fun hide(fPlayer: FPlayer) {
        //fPlayer.scoreboardActive = false
        //toggle(fPlayer.getPlayer()!!)
    }
}