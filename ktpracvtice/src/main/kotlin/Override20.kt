fun main() {
    val oneplus = OnePlus("SmartPhone")
    println(oneplus.name)
    println(oneplus.size)
    oneplus.display()

    val generalMobile = Phone("General")
    println(generalMobile.size)
    generalMobile.display()
}
open class Phone(val type:String){
    open val name:String="Simple Phone"
    open val size:Int=5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting down")
    open fun display() = println("Simple mobile display")
}
class OnePlus(typeParam:String): Phone(typeParam){//parameterised constructor
    override val name: String = "One Plus"

    override val size: Int = 6
    override fun display() = println("One Plus display")

}