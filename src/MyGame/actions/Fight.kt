package MyGame.actions

import MyGame.random.hitOrNo
import MyGame.random.whoStart
import MyGame.units.Enemy
import MyGame.units.Player

class Fight {

    fun fight(player: Player, enemy: String) {
    }

    /**
     * აბრუნებს სახელს, ვინ დაიწყებს პირველი ბრძოლას
     */
    fun starter(player: Player, enemy: Enemy): String {
        val starter = whoStart(player.unit.name, enemy.name)
        return starter
    }

    /**
     * აბრუნებს პასუხს,დაარტყა თუ ააცილა პლეიერმა
     */
    fun playerHit(unit: Player): Double {
        val hit: Boolean = hitOrNo()
        var hitPoint: Double = 0.0
        if (hit) {
            println("${unit.unit.name} hit")
            hitPoint = hitPoint(unit.unit.canDemage)
        } else {
            println("${unit.unit.name} miss")
        }
        return hitPoint
    }

    /**
     * აბრუნებს პასუხს,დაარტყა თუ ააცილა მტერმა
     */
    fun enemyHit(enemy: Enemy): Double {
        val hit: Boolean = hitOrNo()
        var hitPoint: Double = 0.0
        if (hit) {
            println("${enemy.name} hit")
            hitPoint = hitPoint(enemy.canDamage)
        } else {
            println("${enemy.name} miss")
        }
        return hitPoint
    }

    fun hitPoint(maxDemage: Double): Double {
        val hitPont = MyGame.random.hitPoint(maxDemage)
        // println("HitPoint = $hitPont")
        return hitPont
    }

    fun batle(player: Player, enemyBase: MutableList<Enemy>) {
        var batleRound = 0
        /**
         * თუ ბაზაზე დარჩენილია მტერი
         * რანდომ ირჩევს მტერს და იწყებს ბრძოლას
         * თუ გვინდა, რომ მიმდევრობით ებრძოლოს, გავხსნათ // val en = enemyBase[0]
         * ხოლო val en = enemyBase[(0..enemyBase.size).random()] დავაკომენტოთ.
         */
        while (enemyBase.size > 0) {
            //val en = enemyBase[(0..enemyBase.size).random()]
            val en = enemyBase[0]
            val enemyIndex = enemyBase.indexOf(en)
            if (player.unit.health > 0 && en.health > 0) {
                while (player.unit.health > 0 && en.health > 0) {
                    batleRound++
                    println("Round: $batleRound")
                    var atacker = Fight().starter(player, en)

                    if (atacker == "player") {
                        var hit = Fight().playerHit(player)
                        println("hitpoint $hit")
                        en.health -= hit
                        if (en.health <= 0) {
                            enemyBase.removeAt(enemyIndex)
                            println("Enemys on base: ${enemyBase.size}")

                            if (en.unitType == player.unit.weaknessEnemy) {
                                player.unit.health += 50

                            } else {
                                player.unit.health += 35
                            }
                            /**
                            if(player.unit.health > 100.0){
                            player.unit.health = 100.0
                            }
                             **/
                        }
                        println("${player.unit.name} health: ${player.unit.health}. ${en.name} health: ${en.health} \n")
                    } else {
                        var hit = Fight().enemyHit(en)
                        if (en.unitType == player.unit.weaknessEnemy) {
                            hit += hit
                        }
                        if (en.hasAddAttack()) {
                            hit += en.addDamage
                        }
                        println("hitpoint $hit")
                        player.unit.health -= hit

                        println("${player.unit.name} health: ${player.unit.health}. ${en.name} health: ${en.health} \n")
                    }
                }
                if (player.unit.health > 0) {
                    println("Congrats!!!!   ${player.unit.name} WIN!")
                } else {
                    println("You Lose. Try again.")
                    break
                }
            }
        }
        println("Battle Is Over...")

    }
}
