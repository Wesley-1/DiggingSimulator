package me.wesley.simulator.ores.types

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.types.DiamondPickaxe
import me.wesley.simulator.ores.abstraction.Ore

class Diamond : Ore("DiamondOre", arrayOf(DiamondPickaxe())) {

    override fun breakOre(player: Player) {
        checkUsability(player)
        println("You broke a $oreName")
    }

}