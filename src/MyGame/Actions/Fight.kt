package MyGame.Actions
import MyGame.Random.WhoStart
import MyGame.Random.Hit_Or_No
import MyGame.Random.Hit_Point
class Fight {

    /**
     * აბრუნებს სახელს, ვინ დაიწყებს პირველი ბრძოლას
     */
    fun Starter(): String{
        val starter = WhoStart()
        println(starter)
        return starter
    }

    /**
     * აბრუნებს პასუხს,დაარტყა თუ ააცილა შემტევმა
     */
    fun Hit(atacer: String) {
        val hit: Boolean = Hit_Or_No()
        if(hit){
            println("$atacer hit")
            Fight().HitPoin()
        }else{
            println("$atacer miss")
        }
    }

    fun HitPoin(){
        val hitPont = Hit_Point(30)
        println("HitPoint = $hitPont")
    }
}