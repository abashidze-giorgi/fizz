package NewCoffee

import NewCoffee.Machine.FilteredMachine
import NewCoffee.Machine.InvalidCoffeeTypeException
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val machine = FilteredMachine(scanner)
    try {
        val coffee = machine.request()
        println("$coffee price is ${coffee.price()}")
    } catch (ex: InvalidCoffeeTypeException) {
        println(ex.toString())
        println("Do you want to try again?: Y/N")
        if (scanner.next() == "Y")
            main()
    }finally {
        scanner.close()
    }
}