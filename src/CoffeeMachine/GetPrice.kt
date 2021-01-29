package CoffeeMachine

abstract class GetPrice {

    open fun GetPrice(list: List<Double>): Double {

        for(item in list){
            price += item
        }
        return price
    }

    companion object {
        var price = 0.0
    }

}