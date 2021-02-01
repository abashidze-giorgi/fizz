package MyGame.Character

import MyGame.Units.Enemy

open class NanoRobotChar(name:String, unit: String) : Enemy(name){

    override val unitType = unit
    override val name = name
    override var health = Health() + NANO_ROBOT_HEALTH
    override var canDemage = CanDamage() + NANO_ROBOT_CAN_DEMAGE
    var getDamage = GetDamage() + NANO_ROBOT_GET_DEMAGE
    var shield = Shield() + NANO_ROBOT_SHIELD

    companion object {
        private val NANO_ROBOT_HEALTH = 35.0
        private val NANO_ROBOT_CAN_DEMAGE = 6.0
        private val NANO_ROBOT_GET_DEMAGE = 6.0
        private val NANO_ROBOT_SHIELD = 10.0
    }
}