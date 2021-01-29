package CoffeeMachine

// კლასს გადმოეცემა პარამეტრად შეკვეთილი ყავის (ჭიქის) რაოდენობა
class Milk():GetCount() {

    override fun GetItemCount(): Double {
        return super.GetItemCount()
    }

    fun getPrice(cupCount: Double): Double{
        val price: Double
        return itemPrice * cupCount / dim
    }

    companion object{
        const val itemPrice: Double = 0.5 // $ per 1 dose
        const val dim: Double = 1.0
    }
}