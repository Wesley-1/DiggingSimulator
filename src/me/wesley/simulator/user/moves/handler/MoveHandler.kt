package me.wesley.simulator.user.moves.handler

import me.wesley.simulator.data.Player
import me.wesley.simulator.user.moves.abstraction.Move
import me.wesley.simulator.user.moves.types.Dig
import java.lang.NullPointerException

class MoveHandler(private val player: Player) {

    fun perform(move: Move?) {
        when(move) {
            is Dig -> Dig().move(player)
        }
    }
}