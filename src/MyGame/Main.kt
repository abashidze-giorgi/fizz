package MyGame

import MyGame.Actions.Fight
import MyGame.Character.PlayerChar
import MyGame.Units.Player
import MyGame.Units.Ninja


fun main() {
    PlayGame()
}

fun PlayGame(){
    Create_Player()
    Create_Ninja()
    Batle()
}

fun Create_Player(){
    val player = Player("GFavaz", "NINJA")
}

fun Create_Ninja(){
    val ninja1 = Ninja();
}

fun Batle(){
    var atacer = Fight().Starter()
    var hit = Fight().Hit(atacer)
}