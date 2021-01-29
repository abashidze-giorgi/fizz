package NewCoffee.Coffee

import NewCoffee.Coffee.Ingredients.Sugar

class Filtered(
        private val strengthLevel: Int,
        private val sugar: Sugar
): Coffee {
    override fun price(): Double {
        return BASE_PRICE *(strengthLevel*1.2) * sugar.price()
    }

    override fun toString(): String {
        return "coffee.filtered: with $sugar and Strength Level $strengthLevel"
    }

    companion object{
        private const val BASE_PRICE = 2.4
    }

}