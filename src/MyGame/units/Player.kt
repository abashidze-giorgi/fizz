package MyGame.units

import MyGame.character.PlayerChar

class Player(name: String, enemy: String) {
    val name = name
    val weaknessEnemy: String = enemy
    var unit = PlayerChar(name, enemy)

    init {

        println("Player: name: ${unit.name}, health: ${unit.health}, " +
                "demage: ${unit.canDemage}, shield: ${unit.shield}, weaknessEnemy: ${unit.weaknessEnemy}")
    }
}