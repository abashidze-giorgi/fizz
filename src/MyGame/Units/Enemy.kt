package MyGame.Units

import MyGame.Character.MainChar

open class Enemy(name: String) : MainChar() {
    open val unitType = ""
    open var health = 0.0
    open val canDamage = 0.0
    val unit = ""
    open val name = ""
    open val addDamage = 0.0
}
