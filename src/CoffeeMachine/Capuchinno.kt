package CoffeeMachine

class Capuchinno{

    fun getPrice(count: Double,
                 milkCount: Boolean,
                 sugarCount: Boolean,
                 cinCount: Boolean): Double{

        val name: String = "Capuchinno"

        val dose: Double = count
        var price: Double = Companion.basePrice * dose

        val milk = Milk()
        val milkPrice = milk.getPrice(dose)

        val sugar = Sugar()
        val sugarPrice = sugar.getPrice(dose)

        val cin = Cinnamon()
        val cinPrice = cin.getPrice(dose)

        if(milkCount == true) {
            price += milkPrice
        }
        if (sugarCount){
            price += sugarPrice
        }
        if (cinCount){
            price += cinPrice
        }

        println(name)
        println("${dose} dose - ${price} $")
        return price
    }

    companion object {
        private const val basePrice: Double = 2.0
    }
}