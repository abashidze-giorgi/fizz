package MyGame.Character

import MyGame.Units.Enemy

class NanoRobotChar(override val name: String, unit: String) : Enemy(name) {

    override val unitType = unit
    override var health = Health() + NANO_ROBOT_HEALTH
    override var canDemage = Can_Damage() + NANO_ROBOT_CAN_DEMAGE
    var getDamage = Get_Damage() + NANO_ROBOT_GET_DEMAGE
    var shield = Shield() + NANO_ROBOT_SHIELD
    override fun Has_Add_Attack(): Boolean {
        return true
    }

    override val add_demage = Add_Demage() + NANO_ROBOT_ADD_ATACK

    companion object {
        private val NANO_ROBOT_HEALTH = 35.0
        private val NANO_ROBOT_CAN_DEMAGE = 6.0
        private val NANO_ROBOT_GET_DEMAGE = 6.0
        private val NANO_ROBOT_SHIELD = 10.0
        private val NANO_ROBOT_ADD_ATACK = 3.0
    }
}