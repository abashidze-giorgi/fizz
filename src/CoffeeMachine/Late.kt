package CoffeeMachine


class Late(private val sugar: Sugar,
           private val milk: Milk
           ): Cofe, Comparable <Cofe>{
    override fun GetSugar(): Sugar = sugar

    override fun GetMilk(): Milk = milk

    override fun Drink() {
        println("Start Drinking Late")
    }

    override fun compareTo(other: Cofe): Int {
        TODO("Not yet implemented")
    }

}