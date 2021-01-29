package Debug

import java.sql.DriverManager.println

/*Parent Class For All Animal Kinds*/
abstract class Animal {
    private var name = ""
    private var voiceSound: String = ""
    open fun name(): String {
        return name
    }

    /*Can Only Be Called From Child*/
    open fun changeName(newName: String) {
        name = newName
    }

    /*All Animals Can Make Unique Voices In Their Own Way*/
    fun makeVoice(s: String) {
        voiceSound = s
        println(s)
    }
}
