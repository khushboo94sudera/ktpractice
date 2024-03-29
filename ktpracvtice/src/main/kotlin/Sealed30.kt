fun main() {
    val tile1 = Red("Mushroom",25)
    val tile2 = Red("Fire",30)
    println("${tile1.type} - ${tile1.points}")

    //Example
    val tile: Tile = Red("Mushroom",25)
    val points = when(tile){
        is Red -> tile.points * 2
        is Blue -> tile.points * 5
    }
    println(points)
}
sealed class Tile
class Red(val type:String, val points:Int): Tile()
class Blue(val points:Int): Tile()
