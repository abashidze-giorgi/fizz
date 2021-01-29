package NewCoffee.Coffee.Ingredients

class Milk(private val quantity: Int) {

    fun price() = quantity * BASE_PRICE

    override fun toString(): String {
        return "Sugar(Quantity: $quantity)"
    }

    companion object{
        private const val BASE_PRICE = 2.0
    }
}