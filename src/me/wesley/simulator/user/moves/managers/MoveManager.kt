package me.wesley.simulator.user.moves.managers

import me.wesley.simulator.user.moves.abstraction.Move

class MoveManager(moves : Array<Move>) {

    val map = hashMapOf<String?, Move>()

    init {
        for (move in moves) {
            map[move.moveID] = move
        }
    }
}