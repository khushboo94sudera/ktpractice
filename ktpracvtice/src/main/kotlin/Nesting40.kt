fun main() {
    //calling outer class
    val obj = Outer()
    obj.i

    //calling nested class
    val objNest = Outer.Nested()
    objNest.test()

    // When we want to access the properties on outer class we use inner class
    //Here we have to make the object of outer class first then the inner class object
    val innerClass = Outer().InnerNested()
    innerClass.test2()
}
class Outer{
    val i = 0
    class Nested{
        fun test(){
            println("I am in nested class")
        }
    }
    inner class InnerNested{
        fun test2(){
            println("I am in inner nested class $i") //we can access i here(property of parent class)
        }
    }
}