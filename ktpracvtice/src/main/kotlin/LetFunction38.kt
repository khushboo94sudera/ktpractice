fun main() {
    val emp = Employee()
    emp.name = "hello"
    emp.age = 20

    println(emp.age)
    println(emp.name)

    //Using Let function to print the multiple properties
    emp.let {
        it.name = "abc"
        it.age = 50
    }

    //Using with to access the properties in more simplified way
    with(emp){
        name = "xyz"
        age =30
    }

    //Using run -- it is the combination of with and let
    emp.run {
        name = "hi"
        age = 40
    }
    println(emp)
}
data class Employee1(var name:String="", var age:Int=60)