fun main() {
    val ch1 = Child()
    //ch1.myMethod()
    //ch1.myMethod2()
}
open class Parent{
    init {
        println("Parent's constructor is called")
    }
    val name:String = ""
    fun myMethod(){
        println("I am in parent")
    }
}
class Child: Parent(){
    init {
        println("Child's constructor is called")
    }
    val name2:String = ""
    fun myMethod2(){
        println("I am in child")
    }
}