package me.wesley.simulator.user.moves.handler

import me.wesley.simulator.data.Player
import me.wesley.simulator.user.moves.abstraction.Move
import me.wesley.simulator.user.moves.types.Dig

class MoveHandler(private val player: Player) {

    fun transformToMove(move : String) : Move? {

        when(move.toLowerCase()) {
            "dig" -> return Dig()
        }
        return null
    }

    fun perform(move: Move?) {
        when(move) {
            is Dig -> Dig().move(player)
        }
    }
}