import java.io.File

/************************************************************
Name:         Eliana Henderson
Date:         09/27/2022
Assignment:   Text Search Regular Expressions
Class Number: 283
Description:  A program to search a text file using regular expressions
 ************************************************************/

fun main() {

    var endProgram = false

    do {
        print("Enter Department: ")
        var userInput = readln()!!

        val fileName = "src/Enrollment.txt"
        val lines = File(fileName).readLines()

        if (userInput == "EXIT") {
            endProgram = true
        } else {
            print("Enter Class Number: ")
            var classNum = readln()!!

            val firstPattern = """.{10}($userInput)\s+?($classNum)""".toRegex()
            val secondPattern = """^\s{58}|\s{11}?.+""".toRegex()
            for (i in 0..(lines.size - 2)) {
                var line = 1
                val firstMatch = firstPattern.find(lines[i])
                val secondMatch = secondPattern.find(lines[i + 1])
                if (firstMatch != null) {
                    println(lines[i])
                    if (secondMatch != null) {
                        println(lines[i + line])
                        line++
                    }
                }
            }
        }
    } while (!endProgram)
}