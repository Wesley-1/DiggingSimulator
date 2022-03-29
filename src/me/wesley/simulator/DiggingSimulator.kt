package me.wesley.simulator

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.types.DiamondPickaxe
import me.wesley.simulator.user.moves.handler.MoveHandler
import me.wesley.simulator.user.moves.managers.MoveManager
import me.wesley.simulator.user.moves.types.Dig


lateinit var manager: MoveManager

fun main() {
    manager = MoveManager(arrayOf(Dig()))

    val player = Player("Wesley", 0, 0, DiamondPickaxe(), emptyArray())

    while(true) {
        val handler = MoveHandler(player)
        print("What move would you like to take? ")
        handler.perform(manager.map[readLine()])
    }
}
