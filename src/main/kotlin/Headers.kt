import java.util.Date

/************************************************************
Name:         Eliana Henderson
Date:         04/12/2022
Assignment:   Headers
Class Number: 282
Description:  Print out a header to put on each program
 ************************************************************/

fun main() {
    print("Please enter your name: ")
    var name = readln()
    print("Please enter the date: ")
    var date = readln()
    print("Please enter the assignment: ")
    var assignment = readln()
    print("Please enter the class number: ")
    var classNum = readln()
    print("Please enter the description: ")
    var description = readln()


    println("/" + "*".repeat(60))
    println("Name:".padEnd(14) + name)
    println("Date:".padEnd(14) + date)
    println("Assignment:".padEnd(14) + assignment)
    println("Class Number:".padEnd(14) + classNum)
    println("Description:".padEnd(14) + description)
    println("*".repeat(60) + "/")
}