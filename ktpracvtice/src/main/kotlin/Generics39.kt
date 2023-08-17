fun main() {
    //without generics
    val obj = IntContainer(6)
    obj.getValue()

    //with generics
    val iContainer = Container<Int>(4)
    println(iContainer.getValue())
    val sContainer = Container<String>("ABC")
    println(sContainer.getValue())

    val list = listOf<String>()
}
//With generics
class Container<T>(var data:T){
    fun setValue(value:T){
        data = value
    }
    fun getValue():T{
        return data
    }
}
//without generics
class IntContainer(var data:Int){
    fun setValue(value:Int){
        data = value
    }
    fun getValue():Int{
        return data
    }
}
class StringContainer(var data:String){
    fun setValue(value:String){
        data = value
    }
    fun getValue():String{
        return data
    }
}