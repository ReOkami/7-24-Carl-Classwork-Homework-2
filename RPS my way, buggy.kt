import kotlin.random.Random
fun main() {


    var gamenum = Random.nextInt(0, 2)
    var gamechoice = "Blank"
    if (gamenum == 0) {
        gamechoice = "Rock"
    }
    if (gamenum == 1) {
        gamechoice = "Paper"
    }
    if (gamenum == 2) {
        gamechoice = "Scissors"
    }

    var playernum = 5
    System.out.println("Make your choice!")
    println("Rock, Paper, Scissors?")
    var playerchoice = readLine()
    if (playerchoice == "Rock") playernum = 0
    if (playerchoice == "Paper") playernum = 1
    if (playerchoice == "Scissors") playernum = 2

    if (gamenum == 0){
        if(playernum == 0){
            System.out.println("We Tied...")
        }
        else if(playernum == 1){
            println("You win!")
        }
        else{
            println("I win!")
        }
    }
    else if(gamenum == 1){
        if(playernum == 0){
            println("I win!")
        }
        else if(playernum == 1){
            System.out.println("We Tied...")
        }
        else{
            println("You win!")

        }
    }
    else if (gamenum == 2){
        if(playernum == 0){
            println("You win!")
        }
        else if(playernum == 1){
            println("I win!")
        }
        else{
            System.out.println("We tied...")
        }

    }



}














