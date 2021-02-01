package MyGame.Units

import MyGame.Character.MainChar
import MyGame.Character.NinjaChar

open class Enemy (name: String, ):MainChar(){
    open val unitType: String = ""
    open var health: Double = 0.0
    open val canDemage: Double = 0.0
    val unit: String = ""
    open val name: String = ""
}