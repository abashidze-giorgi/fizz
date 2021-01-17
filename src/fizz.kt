fun main() {

    val array = IntArray(50) { it }
    for (el in array) {
        array[el] = array.indexOf(el)

        when {
            el % 15 == 0 -> println("Fizz Buzz")
            el % 5 == 0 -> println("Buzz")
            el % 3 == 0 -> println("Fizz")
            else -> println(el)
        }
    }
}