fun main(){
    class Song(val title: String, val artist: String){
        fun play(){
            println(title + " by " + artist + " Is playing. Jam out!")
        }
        fun stop(){
            println(title + " has been stopped")
        }
    }
    var song1 = Song("Last Suprise", "Lyn")
    var song2 = Song("Mass Destruction", "Lotus Juice + Yumi Kawamura")
    var song3 = Song("Take Over", "Lyn")
    var song1playing = false
    var song2playing = false
    var song3playing = false
    var activeuser = true
    var songvolume = 4
    while(activeuser == true){
        println("what do you want to do?")
        var userinput = readLine()
        if(userinput == "play"){
            println("which song? (type out in words please ex: one, two)")
            var userinput = readLine()
            if(userinput == "one"){
                song1.play()
                song1playing = true
            }
            if(userinput == "two"){
                song2.play()
                song2playing = true
            }
            if(userinput == "three"){
                song3.play()
                song2playing = true
            }
        }
        if(userinput == "pause"){
            if(song1playing == true){
                song1.stop()
                song1playing = false
            }
            if(song2playing == true){
                song2.stop()
                song2playing = false
            }
            if(song3playing == true){
                song3.stop()
                song3playing = false
            }
            else{
                println("No song is playing")
            }

        }
        if(userinput == "close down"){
            println("You Sure?")
            var userinput = readLine()
            if(userinput == "yes") {
                println("thanks for using the program")
                activeuser = false
            }
            if(userinput == "no")
            {
                activeuser = true
                println("carry on then!")
            }
        }
        if(userinput == "volume"){
            println("louder or quieter")
            var userinput = readLine()
            if(userinput == "loud"){
                songvolume++
                println("current volume" + songvolume)
            }
            if (userinput == "quiet"){
                songvolume--
                println("current volume" + songvolume)
            }

        }

    }



}