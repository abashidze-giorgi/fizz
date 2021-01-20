package CoffeeMachine


class Cinnamon(a: Double) {

    fun price(a: Double): Double{
        val price: Double = 6.0 // $ per 1000 gr
        var count: Double = a
        var price1: Double = price * count / 1000
        println("Cinnamone:")
        println("${count} gr - ${price1} \$.")
        return count
    }
        init {
            price(a)
    }
}