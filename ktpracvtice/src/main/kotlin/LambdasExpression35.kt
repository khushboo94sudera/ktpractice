fun main() {
    var fn:(Int, Int)->Int = ::summ
    println(fn(4,5))

    //lambdas
    val lambda1 = {x:Int, y:Int -> x+y} //single line lambda
    val multilineLambda = {             //multi line lambda
        println("Hello Lambda")
        val a = 2+4
        "hey khush"
        3
    }
    println("Result1 = ${lambda1(2,4)}")
    multilineLambda()
    println("Result2")
    println("${multilineLambda()}")


}
fun summ(a:Int, b:Int) : Int = a + b
fun Calculatorr(a:Int, b:Int, c:(Int, Int)-> Int):Int{
    return c(a,b)
}