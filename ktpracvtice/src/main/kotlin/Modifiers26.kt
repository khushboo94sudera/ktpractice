fun main() {

}
open class A{
    public var p = 10
    private var q = 10 //only accessible within the class
    internal var r = 10 //only accessible in a particular project module
    protected var s = 10 //only accessible by subclasses
}
class B:A(){
    fun abc(){
        println(p)
        // println(q) //it is private
        println(r)
        println(s)
    }
}