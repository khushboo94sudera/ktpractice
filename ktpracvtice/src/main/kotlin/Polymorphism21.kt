fun main() {
    val circle:Shape = Circle(4.0)
    val rectangle:Shape = Rectangle(3.0,6.5)
    val shapes:Array<Shape> = arrayOf(Circle(2.0),Rectangle(3.0,5.0),Triangle(4.0,6.0))
    calculateArea(shapes)
}
fun calculateArea(anyShapes:Array<Shape>){
    for (shape in anyShapes){
        println(shape.area())
    }
}
open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape(){
    override fun area(): Double {
        return Math.PI * radius*radius
    }
}
class Rectangle(val l:Double, val b:Double):Shape(){
    override fun area(): Double {
        return 2*l*b
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*base*height
    }
}