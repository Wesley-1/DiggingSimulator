package me.wesley.simulator.data

import me.wesley.simulator.items.abstraction.Item

class Player(
    name: String,
    var level: Int,
    var experience: Int,
    var item: Item,
    val backpack: Array<Item>,
    var balance : Double
) {


    init {
        println("Player has been initialized: $name")
    }
}