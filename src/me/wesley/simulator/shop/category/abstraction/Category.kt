package me.wesley.simulator.shop.category.abstraction

import me.wesley.simulator.data.Player
import me.wesley.simulator.items.abstraction.Item

abstract class Category(var name : String, val itemsInShop : Array<Item>) {

    abstract fun purchase(player: Player, item: Item)
    abstract fun sell(player: Player, item: Item)
    abstract fun exit()
}
