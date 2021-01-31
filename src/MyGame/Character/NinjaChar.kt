package MyGame.Character


open class NinjaChar(name:String) :MainChar(){

    val unitType = "NINJA"
    val name = name
    var health = Health() + NINJA_HEALTH
    var canDemage = CanDamage() + NINJA_CAN_DEMAGE
    var getDamage = GetDamage() + NINJA_GET_DEMAGE
    var shield = Shield() + NINJA_SHIELD

    companion object {
        private val NINJA_HEALTH = 10.0
        private val NINJA_CAN_DEMAGE = 0.0
        private val NINJA_GET_DEMAGE = 0.0
        private val NINJA_SHIELD = 4.0
    }
}