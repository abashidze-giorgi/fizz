package MyGame.Character

import MyGame.Units.Enemy

class NinjaChar(override val name: String, unit: String) : Enemy(name) {

    override val unitType = unit
    override var health = Health() + NINJA_HEALTH
    override var canDamage = canDamage() + NINJA_CAN_DEMAGE
    var getDamage = getDamage() + NINJA_GET_DEMAGE
    var shield = Shield() + NINJA_SHIELD
    val has_add_attack = hasAddAttack()
    override val addDamage = additionalDamage() + NINJA_ADD_ATACK

    companion object {
        private val NINJA_HEALTH = 10.0
        private val NINJA_CAN_DEMAGE = 2.0
        private val NINJA_GET_DEMAGE = 0.0
        private val NINJA_SHIELD = 4.0
        private val NINJA_ADD_ATACK = 0.0
    }
}