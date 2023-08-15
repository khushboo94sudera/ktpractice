fun main() {
    var car = Automobile("car",4,5,true)
    println(car.airBags)
    var person = Personn("abc",20)
    println(person.age)
    println(person.name)
    var person2 = Personn("xyz",25)
    println(person2.age)
    println(person2.name)
    println(person2.canVote)
}
class Automobile(val name:String, val tyres:Int, val maxSitting: Int,hasAirbags:Boolean){
    //here name, tyres, maxSitting are properties and hasAirbags is parameter
    //bacause we have used var and val
    init { // 1st initializer block
        println("$name is created")
    }

    var airBags = hasAirbags
    init {
        println("2nd initializer block ")
    }
    fun drive(){

    }
    fun applyBrakes(){

    }
}
class Empty{}
class Personn(nameParam:String,ageParam:Int){
    val name:String = "$nameParam - Clan"
    var age:Int = ageParam
    var canVote:Boolean = ageParam>18
}