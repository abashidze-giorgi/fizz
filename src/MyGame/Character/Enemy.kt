package MyGame.Character

open class Enemy ():MainChar(){

    //TODO მომავალშ, სახელები იქნება დინამიური
    open fun ReturnNinjaName():String{
        return NINJA_NAME
    }

    //TODO მომავალში სახელები იქნება დინამიური
    open fun ReturnRobotName():String{
        return NANO_ROBOT
    }

    companion object{
        private val NINJA_NAME = "Ninja"
        private val NANO_ROBOT = "NanoRobot"
    }

}



