/************************************************************
Name:         Eliana Henderson
Date:         5/3/2022
Assignment:   Rock, Paper, Scissors, Lizard, Spock
Class Number: 282
Description:  A small program to play the extended version of rock paper scissors
 ************************************************************/

var win = 0
var lose = 0
var draw = 0

fun main() {
    var playing = true

    // start Program Start menu
    println("Do you fancy a game of Rock paper Scissors? ")
    println("Rules are as follows:")
    println("Rock crushes Scissors.")
    println("Scissors cut Paper.")
    println("Paper covers Rock.")
    println("Rock crushes Lizard")
    println("Lizard Poisons Spock")
    println("Spock smashes Scissors")
    println("Scissors decapitates Lizard")
    println("Lizard eats Paper")
    println("Paper disproves Spock")
    println("Spock vaporizes Rock")


    while (playing) {

        print("Would you like to play? (Y or N): ")

        var choice = readLine()!!
        if (choice == "N" || choice == "n") {
            println("Maybe next time!")
            break
        }

        // instruction menu
        println()
        println("Your choices are: ")
        println("'1' for Rock")
        println("'2' for Paper")
        println("'3' for Scissors")
        println("'4' for Lizard")
        println("'5' for Spock")
        println("'6' to quit")
        println()


        for (round in 1..Int.MAX_VALUE) {
            val newChoice = userChoice()
            if (newChoice == 6) {
                println("Thank you for playing!")
                println("Your final score is: You $win, Opponent $lose, Draw $draw")
                playing = false
                break
            }
            //Computer's choice
            computerChoice(newChoice)
        }

    }

}

fun userChoice(): Int {
    print("Make your choice!: ")
    val newChoice = readLine()!!.toInt()
    println()

    when (newChoice) {
        1 -> println("You chose Rock!")
        2 -> println("You chose Paper!")
        3 -> println("You chose Scissors!")
        4 -> println("You chose Lizard!")
        5 -> println("You chose Spock!")
        else -> {
            if (newChoice != 6) {
                println("ERROR: That is not a valid option.")
            }
        }
    }

    return newChoice
}

fun computerChoice(newChoice: Int): Int {
    val compChoice = (1..5).random()

    if (newChoice == 1 && compChoice == 3) {
        println("Opponent chose scissors!")
        println("Rock crushes scissors - You win this round!")
        win++
    } else if (newChoice == 1 && compChoice == 4) {
        println("Opponent chose lizard!")
        println("Rock crushes lizard - You win this round!")
        win++
    } else if (newChoice == 2 && compChoice == 1) {
        println("Opponent chose rock!")
        println("Paper covers rock - You win this round!")
        win++
    } else if (newChoice == 2 && compChoice == 5) {
        println("Opponent chose spock!")
        println("Paper disproves spock - You win this round!")
        win++
    } else if (newChoice == 3 && compChoice == 2) {
        println("Opponent chose paper!")
        println("Scissors cut paper - You win this round!")
        win++
    } else if (newChoice == 3 && compChoice == 4) {
        println("Opponent chose lizard!")
        println("Scissors decapitates lizard - You win this round!")
        win++
    } else if (newChoice == 4 && compChoice == 5) {
        println("Opponent chose spock!")
        println("Lizard poisons spock - You win this round!")
        win++
    } else if (newChoice == 4 && compChoice == 2) {
        println("Opponent chose paper!")
        println("Lizard eats paper - You win this round!")
        win++
    } else if (newChoice == 5 && compChoice == 3) {
        println("Opponent chose scissors!")
        println("Spock crushes scissors - You win this round!")
        win++
    } else if (newChoice == 5 && compChoice == 1) {
        println("Opponent chose rock!")
        println("Spock vaporizes rock - You win this round!")
        win++
    } else if (newChoice == 3 && compChoice == 1) {
        println("Opponent chose rock!")
        println("Rock crushes scissors - Opponent wins this one!")
        lose++
    } else if (newChoice == 4 && compChoice == 1) {
        println("Opponent chose rock!")
        println("Rock crushes lizard - Opponent wins this one!")
        lose++
    } else if (newChoice == 1 && compChoice == 2) {
        println("Opponent chose paper!")
        println("Paper covers rock - Opponent wins this one!")
        lose++
    } else if (newChoice == 5 && compChoice == 2) {
        println("Opponent chose paper!")
        println("Paper disproves spock - Opponent wins this one!")
        lose++
    } else if (newChoice == 2 && compChoice == 3) {
        println("Opponent chose scissors!")
        println("Scissors cut paper - Opponent wins this one!")
        lose++
    } else if (newChoice == 4 && compChoice == 3) {
        println("Opponent chose scissors!")
        println("Scissors decapitates lizard - Opponent wins this one!")
        lose++
    } else if (newChoice == 2 && compChoice == 4) {
        println("Opponent chose lizard!")
        println("Lizard eats paper - Opponent wins this one!")
        lose++
    } else if (newChoice == 5 && compChoice == 4) {
        println("Opponent chose lizard!")
        println("Lizard poisons spock - Opponent wins this one!")
        lose++
    } else if (newChoice == 3 && compChoice == 5) {
        println("Opponent chose spock!")
        println("Spock smashes scissors - Opponent wins this one!")
        lose++
    } else if (newChoice == 1 && compChoice == 5) {
        println("Opponent chose spock!")
        println("Spock vaporizes rock - Opponent wins this one!")
        lose++
    } else {
        println("It's a draw!")
        draw++
    }
    println("Score: You $win, Opponent $lose, Draw $draw \n")

    return win
    return lose
    return draw
}