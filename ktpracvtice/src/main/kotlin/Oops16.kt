fun main() {
    //println(Person("abc",4).canVote())
    val p1 = Person("A", 20)
    val p2 = Person("B", 16)

    println(p1.canVote())
    println(p2.canVote())

    p2.age = 25
    println(p2.canVote())
}
class Person(val name:String, var age:Int){ //properties
    //methods
    fun canVote():Boolean{
        return age > 18
    }
}