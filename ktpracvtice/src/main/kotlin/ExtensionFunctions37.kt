fun main() {
    println("Hi! I am Kotlin".formattedString())
}
fun String.formattedString(): String{
    return "----------\n$this\n----------" //this means current object
}