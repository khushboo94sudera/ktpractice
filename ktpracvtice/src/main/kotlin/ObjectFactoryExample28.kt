fun main() {
    var pizza1 = Pizza.Factory.create("tomato")
    println(pizza1.toString())
    //with companion
    var pizza2 = Pizza.create("paneer makhni")
    println(pizza2.toString())
    var pizza3 = Pizza(type = "tomato", topping = "tomato, cheese")
    println(pizza3.toString())
}
class Pizza(var type:String, var topping:String){
    companion object Factory{
        fun create(pizzaType: String):Pizza{
            return when (pizzaType){
                "tomato" -> Pizza("tomato","tomato , cheese")
                "paneer makhni" -> Pizza("paneer makhni","paneer, makhan, capsicum")
                else -> Pizza("Basic","cheese")
            }
        }
    }

    override fun toString(): String {
        return "Your $type pizza is ready with toppings - $topping"
    }
}