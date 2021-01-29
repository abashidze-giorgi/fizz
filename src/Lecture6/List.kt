package Lecture6


fun main() {
    val list1: List<Int> = listOf(1,2,3,4,5,6,7)
    val mutableList: List<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13)

    println(list1.subList(1,4))

    println(mutableList)
    for(el in mutableList){
        println(el)
    }

    var a = Maniac(arrayOf<Int>(1, 2, 3, 4), mutableListOf<Int>())
    println(a)
}

/**

fun <T>method(array: Array<T>, mutableList : MutableList<T>){
for (elem in array)
mutableList.add(elem)
}

 */
fun <T> Maniac(array: Array<T>, mutableList: MutableList<T>): MutableList<T> {
    for (el in array){
        mutableList.add(el)
    }
        return mutableList
}

