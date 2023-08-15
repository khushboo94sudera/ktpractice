fun main() {
    val gender:String = "Male" //female or others
    val gender1:String? = null // ? operator accepts null vale also
    val isAdult:Boolean? = true // accepts true , false and null

    if (gender1 != null) {
        println(gender1.toUpperCase())
    }

    println(gender1?.toUpperCase()) //safe call operator -- prints null

    gender1?.let {
        println("Line 1")
        println("Line 2 $gender1")
        println("Line 3 $it")
    }

    //Elvis operator ?:
    var selectedValue = gender1 ?: "NA" //print NA if the value is null

    //not null asserted operator
    var value = gender1!!.toUpperCase() //throws an error if the value is null
    println(value)
}