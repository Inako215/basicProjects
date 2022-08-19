/************************************************************
Name:         Eliana Henderson
Date:         5/30/2022
Assignment:   Reverse Digits
Class Number: 282
Description:  A program to reverse a sequence of numbers provided by the user
 ************************************************************/

fun main() {

    print("Please enter a series of numbers: ")
    var digits = readLine()!!.toInt()

    var reversed = reverseDigit(digits)
    println("Your numbers reversed is $reversed")
}

fun reverseDigit(digits: Int) :Int{

    var n = digits
    var reversedDigits = 0

    while (n != 0) {
        var remainder = n % 10
        reversedDigits = (reversedDigits * 10) + remainder
        n /= 10
    }
    return reversedDigits
}