import kotlin.NullPointerException

fun main() {
    val arr = arrayOf(1,2,3)
   // println(arr[5]) //throws error
    try {
        println(arr[5])
    }catch (ex: java.lang.NullPointerException){ //Specific class mentioned before base class
        println(ex)
    }catch (e: Exception){ //Exception is the base class
        println("Please check the array index")
    }finally {
        println("I will execute no matter what")
    }
    println("this wil not run")
}


