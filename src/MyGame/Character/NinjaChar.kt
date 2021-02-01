package MyGame.Character

import MyGame.Units.Enemy

open class NinjaChar(name:String, unit: String) : Enemy(name){

    override val unitType = unit
    override val name = name
    override var health = Health() + NINJA_HEALTH
    override var canDemage = CanDamage() + NINJA_CAN_DEMAGE
    var getDamage = GetDamage() + NINJA_GET_DEMAGE
    var shield = Shield() + NINJA_SHIELD

    companion object {
        private val NINJA_HEALTH = 10.0
        private val NINJA_CAN_DEMAGE = 2.0
        private val NINJA_GET_DEMAGE = 0.0
        private val NINJA_SHIELD = 4.0
    }
}