import kotlin.math.pow

fun main() {
    println("//function overloading")
    val res = addition(2,4)
    println(res)
    val res1 = addition(2.0,4.0)
    println(res1)

    println("//named arguments")
    println(addition(a=2,b=4)) //here we can define the name of the parameter
    println(addition(b=2,a=6)) //they can be in any sequence

    println("//store the function in a variable")
    var fn = ::multiply //overloaded function cannot be stored in a variable
    println(fn(3,8))

    println("//Power of a number")
    val fn2 = ::power
    println(fn2(2.0,3.0))

}
fun addition(a:Int, b:Int):Int{
    return a+b
}
fun addition(a:Double, b:Double):Double{
    return a+b
}
fun multiply(a:Int, b:Int):Int{
    return a * b
}
fun power(a:Double, b:Double):Double{
    return a.pow(b)
}