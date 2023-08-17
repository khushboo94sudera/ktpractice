fun main() {
    //single parameter lambda
    //Example 1
    val singleParam = {a:Int -> a*a} //With type declaration
    val withoutTypeDeclaration :((Int) -> Int) = {a -> a*a}
    println(singleParam(2))
    println(withoutTypeDeclaration(4))

    //Example 2
    val sayHi = {msg:String -> println("Hello $msg") }
    val sayHi2 : ((String)->Unit) = {msg -> println("Hello $msg")}
    sayHi("abc")
    sayHi2("xyz")

    //Simplifying single parameter lambda
    val singleParamLambda:(Int) -> Int = {x -> x*x}
    val simplifySingleParam:(Int) -> Int = {it * it}

    //Calling function
    //Instead of writing like this calculkatorr1(2,4,{a,b-> a*b})
    //use this expression
    calculatorr1(2,4){a,b -> a*b}
}
fun summ1(a:Int, b:Int) : Int = a + b
fun calculatorr1(a:Int, b:Int, c:(Int, Int)-> Int):Int{
    return c(a,b)
}