package CoffeeMachine

import java.util.*

fun Answer(item: String):Boolean{
    var bool: Boolean = false
    print("${item}? 'y', 'n'")
    bool = Scanner(System. `in`).next().toLowerCase() == "y"
    return bool
}