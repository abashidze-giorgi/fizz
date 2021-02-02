package MyGame.Character

class PlayerChar(val name: String, val weaknessEnemy: String) : MainChar() {
    //    val unit = "PLAYER"
    var health = Health() + BASE_HEALTH
    var canDemage = canDamage() + BASE_CAN_DAMAGE
    var getDamage = getDamage() + BASE_GET_DAMAGE
    var shield = Shield() + BASE_SHIELD

    init {
//        println("Unit class: $unit,  name: $name, health: $health, demage: $canDemage, shield: $shield, enemyHero: $enemyHero")
    }

    companion object {
        private val BASE_HEALTH = 80.0
        private val BASE_CAN_DAMAGE = 19.0
        private val BASE_GET_DAMAGE = -0.1
        private val BASE_SHIELD = 4.0
    }
}