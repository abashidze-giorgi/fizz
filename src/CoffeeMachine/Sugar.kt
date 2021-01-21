package CoffeeMachine

// კლასს გადმოეცემა პარამეტრად შეკვეთილი ყავის (ჭიქის) რაოდენობა
class Sugar(){

    // მეთოდი პარამეტრად იღებს შეკვეთის რაოდენობას (a),
    // ამრავლებს ფასზე და ყოფს განზომილების ერთეულზე a * price / dim.
    // აბრუნებს მიღებულ ფასს
    fun getPrice(capCount: Double): Double{
        val price: Double = 0.3 // $ per 1 dose
        val dim: Double = 1.0
        val price1: Double = price * capCount / dim

//        val name: String = "Sugar"
//        println(name)
//        println("${a} gr - ${price1} \$.")

        return price1
    }
}
