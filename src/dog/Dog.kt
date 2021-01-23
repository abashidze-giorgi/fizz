package dog

open class Dog (private val name: String,
                private val age: Int,
                private val weight: Int,
                private val breed: String){

        fun bark(){
            println(if(weight < 20) "Yip!" else "WooF!!!")
    }
}
