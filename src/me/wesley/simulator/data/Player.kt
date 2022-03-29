package me.wesley.simulator.data

import me.wesley.simulator.items.abstraction.Item
import me.wesley.simulator.messaging.MessageTransformer
import me.wesley.simulator.messaging.MessageType

class Player(
    name: String,
    var level: Int,
    var experience: Int,
    var item: Item) {

    init {
        println("Player has been initialized: $name")
    }
}