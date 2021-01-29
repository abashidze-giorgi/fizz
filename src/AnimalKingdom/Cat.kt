package AnimalKingdom

class Cat(private val name: String):Animals {
    fun name(): String = name

    fun meow(){
        println("Meowwww")
    }
}