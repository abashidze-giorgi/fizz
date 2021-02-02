package myGame.character

open class MainChar() {

    fun Health(): Double {
        return HEALTH
    }

    fun canDamage(): Double {
        return CANDAMAGE
    }

    fun getDamage(): Double {
        return GETDAMAGE
    }

    open fun Shield(): Double {
        return SHIELD
    }

    open fun hasAddAttack(): Boolean {
        return HAS_ADDITIONAL_ATTACK
    }

    fun additionalDamage(): Double {
        return ADD_DAMAGE
    }

    companion object {
        private val HEALTH = 50.0
        private val CANDAMAGE = 5.0
        private val GETDAMAGE = 1.0
        private val SHIELD = 3.0
        private val HAS_ADDITIONAL_ATTACK = false
        private val ADD_DAMAGE = 0.0
    }
}
