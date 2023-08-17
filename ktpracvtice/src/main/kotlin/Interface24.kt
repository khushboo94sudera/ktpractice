fun main() {
    val dragObjects: Array<Draggable> = arrayOf(Circlee(2.0),
        Rectanglee(3.0,6.9),Trianglee(3.0,7.8),Player("Anmol"))
    dragObjects(dragObjects)
}

fun dragObjects(objects:Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}

interface Draggable{
    fun drag()
}

abstract class Shapee:Draggable{
    abstract fun area():Double
}

class Circlee(val radius:Double):Shapee(){
    override fun area(): Double {
        return Math.PI * radius*radius
    }
    override fun drag() {
        println("Circle is dragging")
    }
}

class Rectanglee(val l:Double, val b:Double):Shapee(){
    override fun area(): Double {
        return 2*l*b
    }
    override fun drag() {
        println("Rectangle is dragging")
    }
}

class Trianglee(val base:Double,val height:Double):Shapee(){
    override fun area(): Double {
        return 0.5*base*height
    }
    override fun drag() {
        println("Triangle is dragging")
    }
}

class Player(val name:String):Draggable{
    override fun drag() {
        println("$name is dragging")
    }
}