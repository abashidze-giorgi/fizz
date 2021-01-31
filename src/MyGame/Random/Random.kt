package MyGame.Random

class Random {

    fun <T>IsPlayerStartFight(t: T): Boolean{
        val fighters = listOf("player", "enemy")
        return true
    }
}


fun WhoStart():String{
    var starter: String = "enemy"
    val i  = (0..1).random()
    if(i == 1){
        starter = "player"
    }
    return starter
}

//fun Hit_Or_No():Boolean{
//    val hit: Boolean = booleanArrayOf(true, false).random()
//    return hit
//}

fun Hit_Or_No():Boolean{
    var hit = false
    val int = (0..10).random()
    println(int)
    if(int > 3){
        hit = true
    }
    return hit
}


fun Hit_Point(maxDemage: Int): Int{
    val minDemage = maxDemage / 10
    val hitPoint = (minDemage..maxDemage).random()
    return hitPoint
}