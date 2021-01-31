package MyGame.Units

import MyGame.Character.NinjaChar

class Ninja {
    val name: String = "NINJA"
    var unit = NinjaChar(ReturnNinjaName())


    init {
        println("Enemy Type: ${unit.unit}, Health: ${unit.health}, Demage: ${unit.canDemage}")
    }
}



fun ReturnNinjaName():String{
    return "ninja"
}