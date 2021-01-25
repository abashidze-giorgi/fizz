import dog.Dog

fun main() {
    /*val myDog = Dog.Dog.Dog("Tobi", 8, 21, "Mixed")
    println(myDog.name)
    println(myDog.age)
    println(myDog.weight)
    println(myDog.breed)
    myDog.bark()
    */

    val dogs = arrayOf(Dog("Tobi", 8, "Mixed"),
                       Dog("Alpha", 5, "Poddle"))

    println(dogs[0].name)
    println(dogs[0].weight)
    println(dogs[0].breed)
    dogs[0].bark()
    println(dogs[1].name)
    println(dogs[1].weight)
    println(dogs[1].breed)
    dogs[1].bark()
}
