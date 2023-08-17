import java.lang.IllegalArgumentException

fun main() {
    createUserList(5)
    createUserList(-9)
}
fun createUserList(count:Int){
    if(count<0){
        throw IllegalArgumentException("Count must be greater than 0")
    }else{
        println("User list created containing $count users")
    }
}