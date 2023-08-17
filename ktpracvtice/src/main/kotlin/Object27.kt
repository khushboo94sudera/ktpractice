fun main() {
    SharingWidjet.incrementFacebookLikes()
    SharingWidjet.incrementFacebookLikes()
    SharingWidjet.incrementFacebookLikes()
    SharingWidjet.incrementTwitterLikes()
    SharingWidjet.incrementTwitterLikes()
    SharingWidjet.display()

    //Anonymous object
    var anonyObj = object {
        var x:Int = 6
        fun test(){
            println("I am anonymous object expression")
        }
    }
    anonyObj.test()
}
object SharingWidjet{
    private var fbLikes = 0
    private var twitterLikes = 0
    fun incrementFacebookLikes(){
        fbLikes++
    }
    fun incrementTwitterLikes(){
        twitterLikes++
    }
    fun display(){
        println("Facebook likes -- $fbLikes and Twitter likes -- $twitterLikes")
    }
}






