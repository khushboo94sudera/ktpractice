fun main() {
    val animal = "Dog"
    /*if(animal == "Cat"){
        println("Animal is Cat")
    }else if(animal == "Dog"){
        println("Animal is Dog")
    }else if(animal == "Horse"){
        println("Animal is Horse")
    }else{
        println("Animal not found")
    }*/

    when(animal) {
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        "Horse" -> println("Animal is Horse")
        else -> println("Animal not found")
    }

    // when as an expression
    val result = when(animal) {
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        "Horse" -> "Animal is Horse"
        else -> "Animal not found"
    }
    println(result)

    //range in when
    val num = 13
    val res = when(num){
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        in 13..19 -> "teen"
        else -> "not in range"
    }
    println(res)
}
