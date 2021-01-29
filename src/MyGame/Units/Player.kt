package MyGame.Units
import MyGame.Actions.GetDemage
import MyGame.UnitSides.PlayerSide

class Player(name:String, enemy: Enemy){
    var name = name
    var player = PlayerSide(name, enemy.name)
    init {

        println("Player: name: ${player.name}, health: ${player.health}, " +
                "demage: ${player.canDemage}, shield: ${player.shield}, enemyHero: ${player.enemyHero}")
    }


    val enemyHero: String = enemy.name

//    val demage = GetDemage()
}