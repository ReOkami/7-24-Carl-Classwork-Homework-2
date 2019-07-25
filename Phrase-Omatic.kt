import kotlin.random.Random
fun main(args: Array<String>){

    val wordSet1 = arrayOf("Chocolate","big","powerful","little","young")
    println("my first array has ${wordSet1.size} items")

    val wordSet2 = arrayOf("Jacked","funny","cute","addded","Chungus")
    println("my second array has ${wordSet2.size} items")

    val wordSet3 = arrayOf("AAHHH","point","trap","orange","short")
    println("my first array has ${wordSet3.size} items")

    var x = wordSet1[Random.nextInt(0,4)]

    println("the first item is $x")
    val fitemID = x

    var y = wordSet2[Random.nextInt(0,4)]
    println("the next item is $y")
    val sitemID = y

    var z = wordSet3[Random.nextInt(0,4)]
    println("the last item is $z")
    val titemID = z

    println("to put it all together... \n\n\n\n\n")
    println(fitemID + sitemID + titemID)
}