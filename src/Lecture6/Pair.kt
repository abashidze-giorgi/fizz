package Lecture6

class Pair<T, T1>(private var left: T, private var right: T1) {

    val leftSide: T? = null
    val rightSide: T1? = null

    fun setSide(t: T){
        left = t
    }

    fun rightSIde(t: T1){
        right = t
    }
}


fun main(){
//    val side = Pair(Int, Pair(String,Int))
}

fun <T> printAndReturn(t: T): T{
    print(t)
    return t
}