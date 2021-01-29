package NewCoffee.Machine

class InvalidCoffeeTypeException(
        invalidInput: String,
        availableTypes: Array<String>
        ): Exception("Type $invalidInput could not be found. Available Types are: ${availableTypes.joinToString()}") {
}