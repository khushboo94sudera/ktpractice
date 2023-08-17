fun main() {
    val nums = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //simple forEach
    for (i in nums){
        println(i)
    }

    //forEach function
    nums.forEach { println(it) }
}
