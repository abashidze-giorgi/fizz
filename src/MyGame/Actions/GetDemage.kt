package MyGame.Actions

import MyGame.Units.Enemy
import MyGame.Units.Player

open class GetDemage (val player:Player, val enemy: Enemy){
//    val enemy = enemy
    val enemyHero = player.weaknessEnemy
    val demage = player.unit.getDamage






//    fun GetDemage(){
//        val health = player.health - demage
//        if (health <= 0){
//            println("Game Over")
//        }else{
//            player.health = health
//        }
//    }

}