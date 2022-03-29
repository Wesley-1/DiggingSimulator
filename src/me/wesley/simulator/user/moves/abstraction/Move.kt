package me.wesley.simulator.user.moves.abstraction

import me.wesley.simulator.data.Player

abstract class Move(val moveID : String) {
    abstract fun move(player: Player)

}