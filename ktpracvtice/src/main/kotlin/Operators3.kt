fun main() {
    var i=13
    var j=2

    //Arithmatic operators
    println(i + j)
    println(i - j)
    println(i * j)
    println(i.toFloat() / j)

    //Relational operators
    println(i % j)
    println(i > j)
    println(i < j)
    println(i >= j)
    println(i <= j)
    println(i == j)
    println(i != j)

    //Increment / Decrement
    var x = 9
    println(x++ + ++x) //9 + 11

    //Logical operators
    val above70 = true
    val knowsProgramming = false

    //&& AND
    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    //|| OR
    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    //! NOT
    val answer = true
    var result = !answer
     result = !!answer
    println(result)
}