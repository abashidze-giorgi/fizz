package CoffeeMachine

class Late{

    fun getPrice(count: Double,
                 sugarCount: Boolean): Double{

        val name: String = "Late"
        val basePrice: Double = 2.0
        val dose: Double = count
        var price: Double = basePrice * dose

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
}