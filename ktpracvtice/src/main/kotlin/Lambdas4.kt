import kotlin.math.pow

fun main() {
    println(sum1(2.0,3.0))
    println(power1(2.0,4.0))

    // functions can also be stored in variables
    var fn: (a: Double, b: Double) -> Double = ::sum1
    println(fn(2.5,4.0))
}
fun sum1(a:Double, b:Double):Double{
    return a+b
}
fun power1(a:Double, b:Double):Double{
    return a.pow(b)
}