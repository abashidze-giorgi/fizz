package MyGame.character

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
        private const val HEALTH = 50.0
        private const val CANDAMAGE = 5.0
        private const val GETDAMAGE = 1.0
        private const val SHIELD = 3.0
        private const val HAS_ADDITIONAL_ATTACK = false
        private const val ADD_DAMAGE = 0.0
    }
}
