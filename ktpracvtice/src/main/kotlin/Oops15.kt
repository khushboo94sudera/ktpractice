fun main() {
    val mustang = Car("Mustang","petrol", 100)
    val beetle = Car("Beetle","diesel", 200)

    println(mustang.name)
    println(mustang.type)

    println(beetle.name)
    println(beetle.type)

    mustang.driveCar()
    beetle.applyBrakes()
}
class Car(val name:String, val type:String, var kmRan:Int){ //properties
    fun driveCar(){ //methods
        println("$name Car is driving") //accessing properties in methods by using $name
    }
    fun applyBrakes(){
        println("Applied brakes on $name")
    }
}