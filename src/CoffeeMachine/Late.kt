package CoffeeMachine

import kotlin.reflect.jvm.internal.impl.load.java.Constant

class Late{

    fun getPrice(count: Double,
                 sugarCount: Boolean): Double{

        val name: String = "Late"

        val dose: Double = count
        var price: Double = Companion.basePrice * dose

        val milk = Milk()
        val milkPrice = milk.getPrice(dose)

        val sugar = Sugar()
        val sugarPrice = sugar.getPrice(dose)

        if (sugarCount){
            price += sugarPrice
        }

        println(name)
        println("${dose} dose - ${price} $")
        return price
    }

    companion object {
        private const val basePrice: Double = 2.0
    }
}