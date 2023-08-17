fun main() {
    MyClass.MyObject.f() //no need to mention MyObject because it is companion
    MyClass.f()
    MyClass.AnotherObject.g()
}
class MyClass{
    //There is only one companion object in a class

    companion object MyObject{
        @JvmStatic
         fun f(){
            println("I am F from myobject")
        }
    }
    object AnotherObject{
        fun g(){
            println("I am G from another object")
        }
    }
}