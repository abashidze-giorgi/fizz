package dog

open class Dog (val name: String,
                val age: Int,
                val weight: Int,
                val breed: String){

        fun bark(){
            println(if(weight < 20) "Yip!" else "WooF!!!")
    }
}
