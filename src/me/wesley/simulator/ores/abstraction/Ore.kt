package me.wesley.simulator.ores.abstraction

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.abstraction.Item

abstract class Ore(val oreName : String, val usableItems : Array<Item>) {

    abstract fun breakOre(player : Player)

    fun checkUsability(player: Player) : Boolean {
        return usableItems.contains(player.item)
    }
}