/************************************************************
Name:         Eliana Henderson
Date:         4/21/2022
Assignment:   Triangles
Class Number: 282
Description:  Short program to print triangles based on user input
 ************************************************************/

fun main() {

    //Get user input & store in variable
    print("Please enter size of triangle (10): ")
    var n = readLine()!!.toInt()

    //Right triangle
    //Print top line
    println("*")

    //Print inner lines
    for (line in 0..n - 3) {
        print("*" + " ".repeat(line) + "*")
        println()
    }

    //Print bottom line
    println("*".repeat(n))

    //New paragraph
    println()

    //Number triangle
    //Outer loop
    for (line in 1..n) {
        //Nested loop
        for (num in 1..line) {
            print("$num")
        }
        //Print rows
        println()
    }

    //New paragraph
    println()

    //Print top line
    println(" ".repeat(n - 1) + "*")

    //Print inner lines
    //This seems like the most ridiculous way to do this, was there an easier way?
    for (line in n - 3 downTo 0) {
        print(" ".repeat(line + 1) + "*" + " ".repeat((n - 1) - (line + 2)) + "*")
        println()
    }

    //Print bottom line
    println("*".repeat(n))
}