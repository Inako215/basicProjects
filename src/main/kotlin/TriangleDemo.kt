/************************************************************
Name:         Eliana Henderson
Date:         4/21/2022
Assignment:
Class Number: 282
Description:
 ************************************************************/

fun main() {

    var size = readLine()!!.toInt()

    println(" ".repeat( size - 1 ) + "*")

    var lines = size - 2
    var mySpaces = 1
 for(line in 1 .. (size - 2)) {
     println(" ".repeat(lines--) + "*" + " ".repeat(mySpaces) + "*")
     mySpaces += 2

 }

    println("*".repeat((size * 2) - 1))
}