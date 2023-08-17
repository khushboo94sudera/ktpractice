fun main() {
    //val shape = Shape2() //Abstract class cannot be instantiated
    val circle = Circle2(5.0)
    println(circle.area())
    circle.display()
}
abstract class Shape2{
    var name:String=""
    abstract fun area():Double
    abstract fun display()
    fun abc(){
        println("abc")
    }
}
class Circle2(val rad:Double):Shape2(){
    override fun area(): Double = Math.PI * rad * rad
    override fun display() {
        println("Circle is getting displayed")
    }

}