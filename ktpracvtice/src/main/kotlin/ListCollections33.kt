fun main() {
    //by default listOf() is mutable, we cannot change the list and cannot add or remove or edit
    val list1 = mutableListOf<Int>(1,2,3)
    println(list1.indexOf(2))
    println(list1.contains(3))
    list1.add(1,7)
    println(list1)
    list1.remove(7)
    println(list1)

    val list2 = mutableListOf<Int>(11,12)
    list1.addAll(list2)
    println(list1)
}