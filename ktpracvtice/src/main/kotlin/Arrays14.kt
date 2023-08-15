fun main() {
    var arr = arrayOf("one","two","three")//implicit declaration
    var arr1 = arrayOf(1,2,3) //implicit declaration
    var arr2 = arrayOf<Int>(2,3,4) //Explicit declaration

    println("//array iteration")
    for(i in arr){
        println(i)
    }

    println("//array iteration with index")
    for((i,e) in arr.withIndex()){
        println("$i - $e")
    }

    //access elements in array
    println(arr[0]) //first way
    println(arr.get(0)) //another way

    //set value of element
    arr.set(0,"hello")
    println(arr[0])

    //size of an array
    println(arr.size)

}