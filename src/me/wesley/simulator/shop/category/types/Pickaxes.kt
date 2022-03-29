package me.wesley.simulator.shop.category.types

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.abstraction.Item
import me.wesley.simulator.items.types.DiamondPickaxe
import me.wesley.simulator.shop.category.abstraction.Category

class Pickaxes : Category("Pickaxes", arrayOf(DiamondPickaxe())) {

    override fun purchase(player: Player, item: Item) {

        if (player.backpack.contains(item)) {
            print("You already own this item! ")
        }

        if (player.balance >= item.cost) {
            player.backpack.plus(item)
            player.balance -= item.cost
            println("You have just purchased ${item.itemName}")
        }

    }

    override fun sell(player: Player, item: Item) {
        if (player.backpack.contains(item)) {
            val mutableList = player.backpack.toMutableList()
            mutableList.remove(item)
            player.balance += item.cost / 2
        }
    }

    override fun exit() {
        TODO("Not yet implemented")
    }
}