fun main() {

    val day = Day.TUESDAY
    println(day)
    println(day.number)

    for (i in Day.values()){
        println(i)
    }

    day.printFormattedDay()

}
enum class Day(val number:Int){   //Defining constructors in enum
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    fun printFormattedDay(){
        println("Day is $this")
    }
}