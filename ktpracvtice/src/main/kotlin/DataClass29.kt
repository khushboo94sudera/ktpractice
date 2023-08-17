fun main() {
    val p1 = Employee(1,"abc")
    val p2 = Employee(1,"abc")
    println(p1)
    println(p2)
    println(p1.hashCode())
    println(p1 == p2)

    //some another utility functions
    val p3 = p1.copy()
    println(p3)
    val p4 = p1.copy(id = 4)
    println(p4)
    //Destructuring / component n functions
    val(id,name) = p1
    println(id)
    println(name)
    println(p1.component1())
    println(p1.component2())
}
data class Employee(val id:Int,val name:String){ //no need to override toString(),hashCode() and equalsTo()

}