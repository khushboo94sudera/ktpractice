fun main() {
    println("//automatically adds 1 here")
    for(i in 1..5){
        println(i)
    }

    println("//we add 2 here by using step")
    for(i in 1..5 step 2){
        println(i)
    }

    println("//using until...upperbound is not included in it")
    for(i in 1 until 5){
        println(i)
    }

    println("//reverse loop using downTo")
    for(i in 10 downTo 1){
        println(i)
    }

    println("//reverse loop using downTo and step")
    for(i in 10 downTo 1 step 2){
        println(i)
    }

    println("//Table of 2")
    var number = 2
    for(i in 1..10){
        // 2 x 1 = 2
        // 2 x 2 = 4
        //println(number.toString() +" x "+i+" = "+(number * i))
        // String templating
        println("$number x $i = ${number * i}")
    }
}