package MyGame.Character

class PlayerChar(name:String, weaknessEnemy: String):MainChar() {

    val unit = "PLAYER"
    val name = name
    var health = Health() + BASE_HEALTH
    var canDemage = CanDamage() + BASE_CAN_DAMAGE
    var getDamage = GetDamage() + BASE_GET_DAMAGE
    var shield = Shield() + BASE_SHIELD
    val weaknessEnemy = weaknessEnemy

    init {
//        println("Unit class: $unit,  name: $name, health: $health, demage: $canDemage, shield: $shield, enemyHero: $enemyHero")
    }

    companion object{
        private val BASE_HEALTH = 100.0
        private val BASE_CAN_DAMAGE = 8.0
        private val BASE_GET_DAMAGE = -0.1
        private val BASE_SHIELD = 4.0
    }
}

