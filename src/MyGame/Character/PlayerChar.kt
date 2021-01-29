package MyGame.Character

class PlayerChar(name:String):MainChar() {
    val name = name
    var health = Health() + BASE_HEALTH
    var canDamage = CanDamage() + BASE_CAN_DAMAGE
    var getDamage = GetDamage() + BASE_GET_DAMAGE
    var shield = Shield() + BASE_SHIELD

    companion object{
        private val BASE_HEALTH = 50.0
        private val BASE_CAN_DAMAGE = 3.0
        private val BASE_GET_DAMAGE = -0.1
        private val BASE_SHIELD = 4.0
    }
}