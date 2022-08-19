/************************************************************
Name:         Eliana Henderson
Date:         5/29/2022
Assignment:   Extra Credit - Coins
Class Number: 282
Description:  Program that determines the value of the coins in a jar and prints the total in dollars and cents.
 ************************************************************/

fun main() {

    println("Let's count your coin jar!\n")

    print("Please enter the number of Quarters: ")
    var numQuarter = readLine()!!.toInt()

    print("Please enter the number of dimes: ")
    var numDime = readLine()!!.toInt()

    print("Please enter the number of nickels: ")
    var numNickle = readLine()!!.toInt()

    print("Please enter the number of pennies: ")
    var numPenny = readLine()!!.toInt()

    var nQuarters = .25 * numQuarter
    var nDimes = .10 * numDime
    var nNickles = .05 * numNickle
    var nPenny = (.01 * numPenny)
    var change: Double = nQuarters + nDimes + nNickles + nPenny

    println(
        "You have $numQuarter quarters, $numDime dimes, $numNickle nickels, and $numPenny pennies for a total of $${
            String.format(
                "%.2f",
                change
            )
        }"
    )

}