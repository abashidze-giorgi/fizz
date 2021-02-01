package MyGame.Actions
import MyGame.Random.WhoStart
import MyGame.Random.Hit_Or_No
import MyGame.Random.Hit_Point
import MyGame.Units.Enemy
import MyGame.Units.Player

class Fight {

    fun fight(player: Player, enemy: String){
    }

    /**
     * აბრუნებს სახელს, ვინ დაიწყებს პირველი ბრძოლას
     */
    fun Starter(player: Player, enemy: Enemy): String{
        val starter = WhoStart(player.unit.name, enemy.unit.name)
        return starter
    }

    /**
     * აბრუნებს პასუხს,დაარტყა თუ ააცილა პლეიერმა
     */
    fun Player_Hit(unit: Player):Int {
        val hit: Boolean = Hit_Or_No()
        var hitPoint: Int = 0
        if(hit){
            println("${unit.unit.name} hit")
            hitPoint = HitPoin(unit.unit.canDemage.toInt())
        }else{
            println("${unit.unit.name} miss")
        }
        return hitPoint
    }

    /**
     * აბრუნებს პასუხს,დაარტყა თუ ააცილა მტერმა
     */
    fun Enemy_Hit(unit: Enemy):Int {
        val hit: Boolean = Hit_Or_No()
        var hitPoint: Int = 0
        if(hit){
            println("${unit.unit.name} hit")
            hitPoint = HitPoin(unit.unit.canDemage.toInt())
        }else{
            println("${unit.unit.name} miss")
        }
        return hitPoint
    }

    fun HitPoin(maxDemage: Int):Int{
        val hitPont = Hit_Point(maxDemage)
        println("HitPoint = $hitPont")
        return hitPont
    }

    fun Batle(player: Player, enemy: Enemy){
        var batleRound = 0
        while(player.unit.health > 0 && enemy.unit.health > 0){
            batleRound ++
            println("Round: $batleRound")
            var atacker = Fight().Starter(player, enemy)

            if(atacker == "player"){
                var hit = Fight().Player_Hit(player)
                enemy.unit.health -= hit
                println("${player.unit.name} healt: ${player.unit.health}. ${enemy.unit.name} health: ${enemy.unit.health} \n")
            }else{
                var hit = Fight().Enemy_Hit(enemy)
                player.unit.health -= hit
                println("${player.unit.name} healt: ${player.unit.health}. ${enemy.unit.name} health: ${enemy.unit.health} \n")
            }
        }
        if(player.unit.health > 0){
            println("Congrats!!!!   ${player.unit.name} WIN!")
        }else{
            println("You Lose. Try again.")
        }
    }
}

class PlayerWinException(){

}