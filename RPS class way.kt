import kotlin.random.Random
fun main(){
     val wantToPlayAgain = true
    println("Welcome to my game")
    while(wantToPlayAgain == true){
        beginGame()
        val userchoice: Int = readLine()?.toIntOrNull[]?
        val aiChoice = Random.nextInt(1,3)
        playGame(userchoice, aiChoice)

    }
}
fun beginGame(){
    println("enter an integer from 1 - 3")
    println("1 = rock")
    println("2 = paper")
    println("3 = scissors")

}