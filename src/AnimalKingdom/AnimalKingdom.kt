package AnimalKingdom


interface AnimalKingdom {
    fun addDog(dog:Dog)
    fun addCut(cat:Cat)

    fun removeDog(dog:Dog)
    fun removeCat(cat:Cat)

    fun add(animal: Animals)

    fun printNames()
}