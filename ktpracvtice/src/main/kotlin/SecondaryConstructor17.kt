fun main() {
    val car1 = Vehicle("Car","Petrol")
}
class Vehicle(val name:String, val tyres:Int, val maxSitting:Int, val engineType:String){
    constructor(nameParam:String, engineParam:String)://Secondary constructor
            this(nameParam,4,5,engineParam)
}