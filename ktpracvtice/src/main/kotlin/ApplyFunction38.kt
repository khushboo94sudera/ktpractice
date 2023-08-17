fun main() {
    val emp = Employee()
    emp.name = "abc"
    emp.age = 20

    //using apply function to enter the values
    val emp1 = emp.apply {
        name = "test"
        age = 40
    }
    println(emp)
}
data class Employee(var name:String="", var age:Int=60)