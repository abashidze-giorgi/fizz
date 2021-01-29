package MyGame.UnitSides

import MyGame.Character.PlayerChar

class PlayerSide(name: String, enemyHero: String) {
    val name = name
    val unit = PlayerChar("$name")
    var health = unit.health
    var canDemage = unit.canDamage
    var getDemage = unit.getDamage
    var shield = unit.shield
    val enemyHero = enemyHero
    init {
        //println("Unit class: $unit,  name: $name, demage: $canDemage, shield: $shield")
    }
}