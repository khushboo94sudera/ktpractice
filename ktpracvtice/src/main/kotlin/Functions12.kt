fun main() {
    val result = sum(2,3)
    println(result)
    val result1 = sum(4,5)
    println(result1)
    evenOrOdd(12)
    evenOrOdd(13)
    val result2 = subtraction(7,4)
    println(result2)
    printMesssage(5) //argument ...these arguments are of type val we cannot reassign them
    printMesssage() //This will call the default value
}
fun sum(a:Int, b:Int):Int{
    val sum = a+b
    return sum
}

fun evenOrOdd(num:Int){
    val res = if(num % 2 == 0) "even" else "odd"
    println(res)
}

//Inline functions
fun subtraction(x: Int, y:Int) = x -  y

//Default value function
fun printMesssage(count:Int = 2){ //count parameter
    for(i in 1..count){
        println("Hey $i")
    }
}