package MyGame

import MyGame.Actions.Fight
import MyGame.Character.NinjaChar
import MyGame.Locations.EnemyBase
import MyGame.Units.Enemy
import MyGame.Units.Player
import java.io.FileNotFoundException
import java.util.*

class Enemy(){

    companion object{
    var enemyArray = mutableListOf<Enemy>() //TODO უნდა მიიღოს ყველა შექმნილი მტრის ობიექტი

    }
}

fun main() {
    ScannerScan();

    PlayGame()
}

fun ScannerScan() {
    try {
        var indexOfUnit = 0
        val scanner = Scanner("src//MyGame//OtherFiles//enemyList") //TODO არ კითხულობს ფაილს
        // val scanner = Scanner("src/MyGame/enemyFile")

        while (scanner.hasNext()) {
            when {
                scanner.next() == "NINJA" -> Create_Ninja("NINJA$indexOfUnit")
            }
            indexOfUnit ++
//
        }
        //val enemyBase = EnemyBase(enemyArray)
        // base.enter()
    } catch (ex: FileNotFoundException) {
        println("File not Found")
    }
}


fun PlayGame() {
    val player = Create_Player()
    val ninja = Create_Ninja("ninja1")
    Batle(player, ninja)
}

fun Create_Player(): Player {
    var player = Player("GFavaz", "NINJA")
    return player
}

fun Create_Ninja(name: String): Enemy {
    val ninja = Enemy(name);
    //TODO აქედან უნდა ჩასვას ენემიარაიში შექმნილი ობიექტი
    return ninja
}

fun Batle(player: Player, enemy: Enemy) {
    Fight().Batle(player, enemy)
}