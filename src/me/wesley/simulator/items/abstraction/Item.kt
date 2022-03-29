package me.wesley.simulator.items.abstraction

import me.wesley.simulator.data.Player

abstract class Item(var itemName : String, val cost : Double) {

    abstract fun perform(player: Player)
}