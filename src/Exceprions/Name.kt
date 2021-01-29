package Exceprions

class Name<T>(private var realName: T) {
    val variable: T? = null

    fun setT(t: T){
        realName = t
    }


    fun getT(): T {
        return realName
    }
}

fun main(){
    val name = Name("namename")
}