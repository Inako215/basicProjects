/************************************************************
Name:         Eliana Henderson
Date:         5/1/2022
Assignment:   Rock Paper Scissors
Class Number: 282
Description:  A small program to play Rock Paper Scissors with the computer
 ************************************************************/

fun main() {
    var win = 0
    var lose = 0
    var draw = 0
    var playing = true


    println(" Would you like to play a game? The game is Rock Paper Scissors!")
    print(" Please choose Y or N: ")
    val userPick = readLine()!!
    println()

    while (playing) {
        if (userPick == "N" || userPick == "n") {
            println(" Okay! See you next time!")
            break
        } else {
            println(" Thank you for choosing to play!")
            println(" The rules are as follows:")
            println(" Rock crushes Scissors")
            println(" Paper covers Rock")
            println(" Scissors cut Paper \n")

            println(" Your options are:")
            println(" '1' for Rock")
            println(" '2' for Paper")
            println(" '3' for Scissors")
            println(" '4' to Quit \n")
        }

        for (round in 1..Int.MAX_VALUE) {
            print(" Please make your choice: ")
            val yourChoice = readLine()!!.toInt()
            val compChoice = (1..3).random()
            println()

            when (yourChoice) {
                1 -> {
                    println(" You chose Rock!")
                    if (yourChoice == 1 && compChoice == 3) {
                        println(" Opponent chose scissors!")
                        println(" Rock crushes scissors - You win this round!")
                        win++
                    } else if (yourChoice == 1 && compChoice == 2) {
                        println(" Opponent chose paper!")
                        println(" Paper covers rock - Opponent wins this one!")
                        lose++
                    } else {
                        println(" Your opponent chose Rock!")
                        println(" It's a draw!")
                        draw++
                    }
                }
                2 -> {
                    println(" You chose Paper!")
                    if (yourChoice == 2 && compChoice == 1) {
                        println(" Opponent chose Rock!")
                        println(" Paper covers Rock - You win this round!")
                        win++
                    } else if (yourChoice == 2 && compChoice == 3) {
                        println(" Opponent chose Scissors!")
                        println(" Scissors cut Paper - Opponent wins this one!")
                        lose++
                    } else {
                        println(" Your opponent chose Paper!")
                        println(" It's a draw!")
                        draw++
                    }
                }
                3 -> {
                    println(" You chose Scissors!")
                    if (yourChoice == 3 && compChoice == 2) {
                        println(" Opponent chose Paper!")
                        println(" Scissors cut Paper - You win this round!")
                        win++
                    } else if (yourChoice == 3 && compChoice == 1) {
                        println(" Opponent chose Rock!")
                        println(" Rock crushes Scissors - Opponent wins this one!")
                        lose++
                    } else {
                        println(" Your opponent chose Scissors!")
                        println(" It's a draw!")
                        draw++
                    }
                }
                4 -> {
                    println(" Thank you for playing!")
                    println(" Final score: You $win, Opponent $lose, Draw $draw")
                    playing = false
                    break
                }
                else -> {
                    println(" ERROR: That is not a valid choice")
                    continue
                }
            }
            println()
            println(" Score: You $win, Opponent $lose, Draw $draw \n")
        }
    }
}