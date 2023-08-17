fun main() {
    //Implimenting of interface by creating object
    var obj = object :Clonable{
        override fun clone() {
            println("I am clone")
        }
    }
    obj.clone()
    //Extending a class by creating object
    var obj2 = object :Person("Khushboo"){
        override fun fullName() {
            super.fullName()
            println("Anonymous -- $name")
        }
    }
    obj2.fullName()
}
interface Clonable{
    fun clone()
}
open class Person(var name:String){
    open fun fullName(){
        println("Fullname -- $name")
    }
}