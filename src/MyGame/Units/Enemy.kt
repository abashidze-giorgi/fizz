package MyGame.Units

import MyGame.Character.NinjaChar

class Enemy (name: String){

    val name: String =  name

    var unit = NinjaChar(name)

    init {
        println("Enemy: Type: ${unit.unitType} name: ${unit.name}, health: ${unit.health}, " +
                    "demage: ${unit.canDemage}, shield: ${unit.shield}")
        }

}