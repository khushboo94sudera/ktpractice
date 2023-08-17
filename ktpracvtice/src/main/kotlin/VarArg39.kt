fun main() {
    add(1,2,3,3,4,5,3,6,1)
    add(1,1,1,1,1,1,1,1,1,1,1,1,1)
}
fun add(vararg value:Int){
    var sum = 0
    for(i in value){
        sum += i
    }
    println(sum)
}