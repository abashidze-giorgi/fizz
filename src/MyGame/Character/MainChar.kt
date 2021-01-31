package MyGame.Character

abstract class MainChar() {

    open fun Health():Double{
        return HEALTH
    }

    open fun CanDamage():Double{
        return CANDAMAGE
    }

    open fun GetDamage():Double{
        return GETDAMAGE
    }

    open fun Shield():Double{
        return SHIELD
    }

    companion object{
        private val HEALTH = 50.0
        private val CANDAMAGE = 5.0
        private val GETDAMAGE = 1.0
        private val SHIELD = 3.0
    }
}
