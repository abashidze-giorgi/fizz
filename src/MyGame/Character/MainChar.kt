package MyGame.Character

open class MainChar() {

    fun Health(): Double {
        return HEALTH
    }

    fun Can_Damage(): Double {
        return CANDAMAGE
    }

    fun Get_Damage(): Double {
        return GETDAMAGE
    }

    open fun Shield(): Double {
        return SHIELD
    }

    open fun Has_Add_Attack(): Boolean {
        return HAS_ADDITIONAL_ATTACK
    }

    fun Add_Demage(): Double {
        return ADD_DEMAGE
    }

    companion object {
        private val HEALTH = 50.0
        private val CANDAMAGE = 5.0
        private val GETDAMAGE = 1.0
        private val SHIELD = 3.0
        private val HAS_ADDITIONAL_ATTACK = false
        private val ADD_DEMAGE = 0.0
    }
}
