package CoffeeMachine


//import CoffeeMachine.Milk
//import CoffeeMachine.Sugar
//
//abstract class Cofe() {
//
//
//    abstract val random1: Int
//
//     abstract fun Drink()
//
//     protected fun IsHotOrNot(): Boolean{
//         return true
//     }
// }


interface Cofe{
    fun GetSugar(): Sugar
    fun GetMilk(): Milk
    fun Drink()
}
