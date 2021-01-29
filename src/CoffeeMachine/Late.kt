package CoffeeMachine


class Late():Coffee(){
    override fun Drink(name: String) {
        super.Drink("Latte")
        println("Drink $name")
    }

}



//class Late(private val sugar: Sugar,
//           private val milk: Milk
//           ): CoffeeMachine, Comparable <CoffeeMachine>{
//    override fun GetSugar(): Sugar = sugar
//
//    override fun GetMilk(): Milk = milk
//
//    override fun Drink() {
//        println("Start Drinking Late")
//    }
//
//    override fun compareTo(other: CoffeeMachine): Int {
//        TODO("Not yet implemented")
//    }
//
//}