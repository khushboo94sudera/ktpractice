fun main() {
    val shape = Shape1()
    printArea(shape)
    val circle = Circle1(2.3)
    printArea(circle)
    val rectangle = Rectangle1(4.0,3.0)
    printArea(rectangle)
}

fun printArea(anyShape:Shape1){
    println(anyShape.area())
}
open class Shape1{
    open fun area():Double{
        return 0.0
    }
}
class Circle1(val radius:Double):Shape1(){
    override fun area(): Double {
        return Math.PI * radius*radius
    }
}
class Rectangle1(val l:Double, val b:Double):Shape1(){
    override fun area(): Double {
        return 2*l*b
    }
}
class Triangle1(val base:Double,val height:Double):Shape1(){
    override fun area(): Double {
        return 0.5*base*height
    }
}