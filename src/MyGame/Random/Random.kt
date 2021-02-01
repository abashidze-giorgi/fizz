package MyGame.Random

import MyGame.Character.MainChar
import MyGame.Units.Enemy
import MyGame.Units.Player

/**
 * ღებულობს ორ ცვლადს და რანდომ აბრუნებს რომელიმეს.
 */
fun WhoStart(player: String, enemy: String):String{
    var starter: String = "enemy"
    val i  = (0..1).random()
    if(i == 1){
        starter = "player"
    }
    return starter
}

/**
 * აბრუნებს თრუს ორ ფოლსს, რის მიხედვითაც ვსაზღვრავთ, დაარტყა თუ ააცილა
 */
//fun Hit_Or_No():Boolean{
//    val hit: Boolean = booleanArrayOf(true, false).random()
//    return hit
//}

/**
 * აბრუნებს თრუ ორ ფალსს, რის მიხედვითაც ვსაზღვრავთ, დაარტყა თუ ააცილა
 *  //TODO უნიტს უნდა დაემატოს acuracy, რომელიც განსაზღვრავს დარტყმის ძალის პროცენტს
 */
fun Hit_Or_No():Boolean{
    var hit = false
    val int = (0..10).random()
    if(int > 3){
        hit = true
    }
    return hit
}

/**
 *  პრიმიტიული ლოგიკით ვსაზღვრავთ, რა ძალითდ აარტყა
 *  //TODO მომავალში უნდა გადმოეცეს უნიტის დარტყმის ძალა(maxDemage-ში) და იქედან განისაზღვროს მნიშვნელობა
 */
fun Hit_Point(maxDemage: Int): Int{
    val minDemage = maxDemage / 10
    val hitPoint = (minDemage..maxDemage).random()
    return hitPoint
}