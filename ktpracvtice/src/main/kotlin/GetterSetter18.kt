fun main() {
    //Default constructor(parameterless constructor)
    var ob = Calculator1()
    println(ob.sum(2,4))

    //Getter and setter
    val p1 = Per("xyz",20)
    println(p1.age)
    p1.age = 12 //setter
    //p1.age = -30 //setter throws exception
    println(p1.name)//getter
}

//Default constructor
class Calculator1{
    lateinit var message: String//lateinit cannot be val, int, float, boolean
    fun sum(a:Int, b:Int):Int{
        return a+b
    }
    fun mul(a:Int, b:Int):Int{
        return a*b
    }
}
//Getter and Setter
class Per(nameParam:String, ageParam:Int){
    var name:String = nameParam
        get() = field.uppercase()
    var age:Int = ageParam
        set(value) = if(value > 0) field = value else throw Exception("Age cannot be negative")

    //default getter and setter
    var email:String =""
        get() = field
        set(value){
            field = value
        }
}