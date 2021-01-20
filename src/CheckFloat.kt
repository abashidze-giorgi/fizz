import java.util.*

fun main() {
    abc()
}


    fun abc() {
        var fl: Float = 0f
        var input = Scanner(System. `in`)
        var check: Boolean = false
        while (check!= true){
            input = Scanner(System. `in`)

            if(input.hasNextFloat()){
                check = true;
                fl = input.nextFloat()
            }
        }
        println("float is: ${fl}")
    }