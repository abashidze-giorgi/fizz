package MyGame

import MyGame.Actions.Fight
import MyGame.Character.NanoRobotChar
import MyGame.Character.NinjaChar
import MyGame.Locations.EnemyBase
import MyGame.Units.Enemy
import MyGame.Units.Player
import java.io.File
import java.io.FileNotFoundException


fun main() {
//    readFileLineByLineUsingForEachLine("src//MyGame//OtherFiles//enemyList")
    val enemyBase = createEnemyBase("Base1")
    scannerScan(enemyBase)
    playGame(enemyBase)
}

fun createEnemyBase(name: String): MutableList<Enemy> {
    val base = EnemyBase()
    val enemyBase = base.createBase(mutableListOf<Enemy>())
    return enemyBase
}

// fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }

fun scannerScan(enemyBase: MutableList<Enemy>) {
    try {
        val fileName = "src//MyGame//OtherFiles//enemyList"
        var indexOfNinjaUnit = 1
        var indexOfNanoUnit = 1
        File(fileName).forEachLine {
            when {
                it == "NINJA" -> {
                    createNinja("NINJA$indexOfNinjaUnit", enemyBase); indexOfNinjaUnit++
                };

                it == "NANO_ROBOT" -> {
                    create_Nano("NANO_ROBOT$indexOfNanoUnit", enemyBase); indexOfNanoUnit++
                }
            }

        }

    } catch (ex: FileNotFoundException) {
        println("File not Found")
    }
}

fun playGame(enemyBase: MutableList<Enemy>) {
    val player = createPlayer()
    var index = 1
    for (el in enemyBase) {
        print("$index - ${el.name}. ")
        index++
    }
    println("")
    println("Total Enemys: ${index - 1}")
    print("Press 'Enter'")
    System.`in`.read()
    batle(player, enemyBase)
}

fun createPlayer(): Player {
    val player = Player("GFavaz", "NINJA")
    return player
}

fun createNinja(name: String, enemyBase: MutableList<Enemy>): Enemy {
    val ninja = NinjaChar(name, "NINJA");
    enemyBase.add(ninja)
    return ninja
}

fun create_Nano(name: String, enemyBase: MutableList<Enemy>): Enemy {
    val NanoRobot = NanoRobotChar(name, "NANO_ROBOT");
    enemyBase.add(NanoRobot)
    return NanoRobot
}

fun batle(player: Player, enemyBase: MutableList<Enemy>) {
    Fight().Batle(player, enemyBase)
}