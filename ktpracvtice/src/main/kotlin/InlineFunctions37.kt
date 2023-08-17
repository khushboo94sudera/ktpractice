fun main() {
    calculateTimeAndRun {
        Loop(100000000)
    }
}
inline fun calculateTimeAndRun(fn: ()->Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    val time = "${end - start} ms"
    println(time)
}
fun Loop(n:Int){
    for (i in 1..n){
        //
    }
}