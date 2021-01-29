package Debug


class Dog : Animal() {

    init {
        changeName("Spock")
    }

    override fun name(): String {
        return super.name()
    }
}
