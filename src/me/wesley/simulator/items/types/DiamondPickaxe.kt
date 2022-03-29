package me.wesley.simulator.items.types

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.abstraction.Item
import me.wesley.simulator.ores.abstraction.Ore
import me.wesley.simulator.ores.types.Diamond
import me.wesley.simulator.ores.types.Stone
import kotlin.math.sign
import kotlin.random.Random

class DiamondPickaxe : Item("DiamondPickaxe", 200.0) {

    override fun perform(player: Player) {

        val random = Random.nextInt(100)

        if (random <= 10) {
            Diamond().breakOre(player)
        } else if (random <= 100) {
            Stone().breakOre(player)
        }
    }

}