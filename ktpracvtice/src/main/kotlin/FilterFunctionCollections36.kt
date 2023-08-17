fun main() {
    val nums = listOf<Int>(1,2,3,4,5,6,7,8,9,10)

    //List of odd numbers(using function referencing operator)
    val filteredList = nums.filter(::oddNum)
    println(filteredList)

    //passing function directly
    val filteredList1 = nums.filter(fun (a:Int):Boolean{
        return a % 2 != 0
    })
    println(filteredList1)

    //Simplified way of writing lambda function
    val filteredList2 = nums.filter { a: Int -> a % 2 != 0 }
    println(filteredList2)

    //More Simplified way of writing lambda function
    val filteredList3 = nums.filter { it % 2 != 0 }
    println(filteredList3)

    //Example
    val userList = listOf<User>(
        User(1,"Abc"),
        User(2,"Xyz"),
        User(3,"Abc2"),
        User(4,"Xyz2"),
    )
    val filterUserList = userList.filter{it.id == 2}
    println(filterUserList)
    val filterUserList1 = userList.filter{it.name == "Abc"}
    println(filterUserList1)
}
fun oddNum(a:Int):Boolean{
    return a % 2 != 0
}
data class User(val id:Int, val name:String)