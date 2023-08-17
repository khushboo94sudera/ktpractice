fun main() {
    val circle = Circleee(5.0)
    val player = Playerr("anmol")
    val arr: Array<Draggablee> = arrayOf(circle,player)
    for (obj in arr){
        if(obj is Circleee){
            println(obj.area())
        }else{
            (obj as Playerr).sayMyName()
        }
    }
}
interface Draggablee{
    fun drag()
}

abstract class Shapeee:Draggablee{
    abstract fun area():Double
}

class Circleee(val radius:Double):Shapeee(){
    override fun area(): Double = Math.PI * radius*radius
    override fun drag() {
        println("Circle is dragging")
    }
}
class Playerr(val name:String):Draggablee{
    override fun drag() {
        println("$name is dragging")
    }
    fun sayMyName(){
        println("My name is $name")
    }
}