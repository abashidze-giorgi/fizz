package CoffeeMachine

// კლასს გადმოეცემა პარამეტრად შეკვეთილი ყავის (ჭიქის) რაოდენობა
class Milk() {

    // მეთოდი პარამეტრად იღებს შეკვეთის რაოდენობას (a),
    // ამრავლებს ფასზე და ყოფს განზომილების ერთეულზე a * price / dim.
    // აბრუნებს მიღებულ ფასს
    fun getPrice(cupCount: Double): Double{
        val price: Double = 0.5 // $ per 1 dose
        val dim: Double = 1.0
        val price1: Double
        price1 = price * cupCount / dim

//        val name: String = "Milk"
//        println(name)
//        println("${a} gr - ${price1} \$.")

        return price1
    }
}