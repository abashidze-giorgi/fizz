package NewCoffee.Coffee.Ingredients

class Sugar(private val quantity: Int) {
    fun price() = quantity * BASE_PRICE

    override fun toString(): String {
        return "Sugar(quantity:$quantity)"
    }

    companion object {
        private const val BASE_PRICE = 1.5
    }
}