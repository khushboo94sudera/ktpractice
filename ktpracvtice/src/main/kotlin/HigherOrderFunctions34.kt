fun main() {
    calc(2.9,1.2,::mul1)
}
fun mul1(a:Double,b:Double):Double{
    return a*b
}
fun calc(a:Double,b:Double,c:(Double,Double)->Double){ //Function type should be same here
    val result = c(a,b)
    println(result)
}