fun main() {
    val students = mutableMapOf<Int, String>()
    students.put(1,"Abc")
    students.put(2,"xyz")
    students.put(3,"pqr")
    println(students.get(2))
    for ((key,value) in students){
        println("$key = $value")
    }
    students[8] = "Johnes"
    println(students[8])

    //Immutable map
    val stu = mapOf<Int,String>(1 to "Hello", 2 to "World")
    println(stu)
}