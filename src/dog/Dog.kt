package dog

//open class Dog (val name: String, val age: Int, val weight: Int, val breed: String){
//
//        fun bark(){
//            println(if(weight < 20) "Yip!" else "WooF!!!")
//    }
//
//}
open class Dog (val name: String, val weight: Int, breed_param: String){

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()
    lateinit var temperament: String

    init{
        println("Dog $name has been created.")
    }


    init{
        println("The breed is $breed")
    }
    fun bark(){

    }
}