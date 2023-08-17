fun main() {
    val nums = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //List of square of nums
    val squareList = nums.map{it * it}
    println(squareList)

    //List of paid users
    val userList = listOf<User>(
        User(1,"Abc"),
        User(2,"Xyz"),
        User(3,"Abc2"),
        User(4,"Xyz2"),
    )
    val paidUserList = userList.map{
        PaidUsers(it.id, it.name, "Paid")
    }
    println(paidUserList)
}
data class Users(val id:Int, val name:String)
data class PaidUsers(val id:Int, val name:String, val type:String)