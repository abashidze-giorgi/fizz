package MyGame

import MyGame.Actions.Fight
import MyGame.Character.MainChar
import MyGame.Character.NinjaChar
import MyGame.Locations.EnemyBase
import MyGame.Units.Enemy
import MyGame.Units.Player
import java.io.File
import java.io.FileNotFoundException
import java.util.*
import kotlin.reflect.typeOf

class Main(){

}

fun main() {
//    readFileLineByLineUsingForEachLine("src//MyGame//OtherFiles//enemyList")
    var enemyBase = Create_Enemy_Base("Base1")
    ScannerScan(enemyBase)
    PlayGame(enemyBase)
}

fun Create_Enemy_Base(name: String): MutableList<Enemy>{
    val base = EnemyBase()
    var enemyBase = base.CreateBase(mutableListOf<Enemy>())
//    if (enemyBase is MutableList<Enemy>) {
//        println("true")
//    }
    return enemyBase
}

fun readFileLineByLineUsingForEachLine(fileName: String)
        = File(fileName).forEachLine { println(it) }

fun ScannerScan(enemyBase: MutableList<Enemy>) {
    try {
        val fileName = "src//MyGame//OtherFiles//enemyList"
        var indexOfUnit = 1
        File(fileName).forEachLine { Create_Ninja("NINJA$indexOfUnit", enemyBase); indexOfUnit++ }

    } catch (ex: FileNotFoundException) {
        println("File not Found")
    }
}

fun PlayGame(enemyBase: MutableList<Enemy>) {
    val player = Create_Player()
    println(enemyBase)
    for(el in enemyBase){
        Batle(player, el)
//        if (el.unit.health <= 0){
//            enemyBase.remove(el)
//            println(enemyBase)
//        }
    }

}

fun Create_Player(): Player {
    var player = Player("GFavaz", "NINJA")
    return player
}

fun Create_Ninja(name: String, enemyBase: MutableList<Enemy>): Enemy {
    val ninja = Enemy(name);
    enemyBase.add(ninja)
    //TODO აქედან უნდა ჩასვას ენემიარაიში შექმნილი ობიექტი
    return ninja
}

fun Batle(player: Player, enemy: Enemy) {
    Fight().Batle(player, enemy)
}