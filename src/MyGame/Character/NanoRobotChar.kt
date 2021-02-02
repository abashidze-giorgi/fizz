package MyGame.Character

import MyGame.Units.Enemy

class NanoRobotChar(override val name: String, unit: String) : Enemy(name) {

    override val unitType = unit
    override var health = Health() + NANO_ROBOT_HEALTH
    override var canDamage = canDamage() + NANO_ROBOT_CAN_DEMAGE
    var getDamage = getDamage() + NANO_ROBOT_GET_DEMAGE
    var shield = Shield() + NANO_ROBOT_SHIELD
    override fun hasAddAttack(): Boolean {
        return true
    }

    override val addDamage = additionalDamage() + NANO_ROBOT_ADD_ATACK

    companion object {
        private val NANO_ROBOT_HEALTH = 35.0
        private val NANO_ROBOT_CAN_DEMAGE = 6.0
        private val NANO_ROBOT_GET_DEMAGE = 6.0
        private val NANO_ROBOT_SHIELD = 10.0
        private val NANO_ROBOT_ADD_ATACK = 3.0
    }
}