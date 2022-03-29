package me.wesley.simulator.user.moves.types

import me.wesley.simulator.data.Player
import me.wesley.simulator.user.moves.abstraction.Move

class Dig : Move("Dig") {

    override fun move(player : Player) {
        player.experience += 20
        player.item.perform(player)
        when(player.experience) {
            100 -> {
                player.level += 1
                player.experience = 0
                print("You have leveled up! New level ${player.level}" + "\n")

            }
        }
    }
}