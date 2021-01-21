package CoffeeMachine

// კლასს გადმოეცემა პარამეტრად შეკვეთილი ყავის (ჭიქის) რაოდენობა
class Cinnamon() {

    // მეთოდი პარამეტრად იღებს შეკვეთის რაოდენობას (a),
    // ამრავლებს ფასზე და ყოფს განზომილების ერთეულზე a * price / dim.
    // აბრუნებს მიღებულ ფასს
    fun getPrice(capCount: Double): Double{
        val price: Double = 1.2 // $ per 1 dose
        val dim: Double = 1.0
        val price1: Double = price * capCount / dim

//        println(name)
//        println("${a} gr - ${price1} \$.")
//        val name: String = "Cinnamon"

        return price1
    }
}
