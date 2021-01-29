package AnimalKotlin

class Labrador():Dog() {
    override fun move(){
        super.move()
        println("Labrador move and run run run....")
    }

    init {
        println("Labrador Created...")
    }

}