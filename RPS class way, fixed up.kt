import kotlin.random.Random
fun main(){
    var userTranslation = 0
    var gamesplayed = 0
    var OwantToPlayAgain = true
    println("Welcome to my game")
    while(OwantToPlayAgain == true){
        beginGame()
        val userchoice = readLine()
        if(userchoice == "Rock"){
             userTranslation = 1
        }
        else if(userchoice == "Paper"){
             userTranslation = 2
        }
        else if(userchoice == "Scissors") {
            userTranslation = 3
        }
        val aiChoice = Random.nextInt(1,3)
        playGame(userTranslation, aiChoice)
        println("Care to play again? Y/N")
        var wantToPlayAgain = readLine()
        if(wantToPlayAgain == "Y"){
            OwantToPlayAgain = true
            gamesplayed++
        }
        if(wantToPlayAgain == "N"){
            OwantToPlayAgain = false
            println("Thank you so much, for a playing my game")
            println("by the way, we played $gamesplayed games!")
        }
    }
}
fun beginGame(){
    println("Rock")
    println("Paper")
    println("Scissors")
    println("Choose")
}
fun playGame(userTranslation: Int, aiChoice: Int){
    println(" You chose $userTranslation  and I chose $aiChoice")
    val result = when (userTranslation){
        aiChoice -> "We Tied"
        1 -> if(aiChoice == 2)"I win!" else "You Win"
        2 -> if(aiChoice == 3)"I win!" else "You Win"
        3 -> if(aiChoice == 1)"I win!" else "You win"
        else -> "You do know how this game works right? I win by default."
    }
    println(result)
}