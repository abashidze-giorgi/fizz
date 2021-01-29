package NewCoffee.Machine

import NewCoffee.Coffee.Coffee
import java.util.*

abstract class CoffeeMachine(
        protected val scanner: Scanner
) {

    abstract fun request(): Coffee

    protected fun requestSugar(): Int {
        print("Please Enter Sugar Quantity : ")
        return when (val sugar = scanner.nextInt()) {
            in Int.MIN_VALUE..0 -> 0
            else -> sugar
        }
    }

}