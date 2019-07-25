class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean){
    fun playSnare(){
        if(hasSnare)
            println("BANG BANG BANG")

    }
    fun playTopHat(){
        if(hasTopHat)
            println("ding ding bada bing")

    }
}
fun main(){
    val d = DrumKit(true,true)
    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()



}