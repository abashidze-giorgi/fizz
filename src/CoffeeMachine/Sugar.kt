package CoffeeMachine

// კლასს გადმოეცემა პარამეტრად შეკვეთილი ყავის (ჭიქის) რაოდენობა
class Sugar():GetCount(){

    override fun GetItemCount(): Double {
        return super.GetItemCount()
    }

    fun getPrice(): Double {
        val capCount = GetItemCount()
        return price * capCount / dim
    }


    companion object{
        const val price: Double = 1.0
        const val dim: Double = 1.0
    }
}
