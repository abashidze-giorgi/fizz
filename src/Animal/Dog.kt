package Animal

class Dog(
        private val name: String
):Animal(name) {
}


class Human(
        private val firstName: String,
        private val lastName: String
): Animal("$firstName $lastName")