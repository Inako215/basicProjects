/************************************************************
Name:         Eliana Henderson
Date:         5/30/2022
Assignment:   LeapYears
Class Number: 282
Description:  A program to list all leap years within a range provided by user inout
 ************************************************************/

fun main() {
    print("Please enter start year: ")
    var yearStart = readLine()!!.toInt()

    print("Please enter end year: ")
    var yearEnd = readLine()!!.toInt()

    var yearRange = yearStart..yearEnd
    var leapYear = ""

    for (year in yearRange) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            leapYear += ("$year, ")
        }
    }
    println("Leap years between $yearStart and $yearEnd: ${leapYear.dropLast(2)}")
}