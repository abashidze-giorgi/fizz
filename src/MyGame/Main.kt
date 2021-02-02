package MyGame

import MyGame.Actions.Fight
import MyGame.Character.NanoRobotChar
import MyGame.Character.NinjaChar
import MyGame.Locations.EnemyBase
import MyGame.Units.Enemy
import MyGame.Units.Player
import java.io.File
import java.io.FileNotFoundException
import java.util.*
import kotlin.reflect.typeOf

class Main() {

}

fun main() {
//    readFileLineByLineUsingForEachLine("src//MyGame//OtherFiles//enemyList")
    var enemyBase = Create_Enemy_Base("Base1")
    ScannerScan(enemyBase)
    PlayGame(enemyBase)
}

fun Create_Enemy_Base(name: String): MutableList<Enemy> {
    val base = EnemyBase()
    var enemyBase = base.CreateBase(mutableListOf<Enemy>())
    return enemyBase
}

// fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }

fun ScannerScan(enemyBase: MutableList<Enemy>) {
    try {
        val fileName = "src//MyGame//OtherFiles//enemyList"
        var indexOfNinjaUnit = 1
        var indexOfNanoUnit = 1
        File(fileName).forEachLine {
            when{
                it == "NINJA" -> {Create_Ninja("NINJA$indexOfNinjaUnit", enemyBase); indexOfNinjaUnit++};

                it == "NANO_ROBOT" -> {Create_Nano("NANO_ROBOT$indexOfNanoUnit", enemyBase); indexOfNanoUnit++}
            }

        }

    } catch (ex: FileNotFoundException) {
        println("File not Found")
    }
}

fun PlayGame(enemyBase: MutableList<Enemy>) {
    val player = Create_Player()
    var index = 1
    for(el in enemyBase){
        print("$index - ${el.name}. ")
        index++
    }
    println("")
    println("Total Enemys: ${index-1}")
    print("Press 'Enter'")
    System. `in`.read()
    for (el in enemyBase) {
        Batle(player, el, enemyBase)

    }
}

fun Create_Player(): Player {
    var player = Player("GFavaz", "NINJA")
    return player
}

fun Create_Ninja(name: String, enemyBase: MutableList<Enemy>): Enemy {
    var ninja = NinjaChar(name, "NINJA");
    enemyBase.add(ninja)
    return ninja
}

fun Create_Nano(name: String, enemyBase: MutableList<Enemy>): Enemy {
    val NanoRobot = NanoRobotChar(name, "NANO_ROBOT");
    enemyBase.add(NanoRobot)
    //TODO აქედან უნდა ჩასვას ენემიარაიში შექმნილი ობიექტი
    return NanoRobot
}

fun Batle(player: Player, enemy: Enemy, enemyBase: MutableList<Enemy>) {
    Fight().Batle(player, enemy, enemyBase)
}