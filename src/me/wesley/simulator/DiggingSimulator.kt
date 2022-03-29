package me.wesley.simulator

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.types.DiamondPickaxe
import me.wesley.simulator.user.moves.handler.MoveHandler
import me.wesley.simulator.user.moves.types.Dig


fun main() {

    val player = Player("Wesley", 0, 0, DiamondPickaxe())

    while(true) {
        val handler = MoveHandler(player)
        print("What move would you like to take? ")
        handler.perform(handler.transformToMove(readLine()!!))
    }
}
