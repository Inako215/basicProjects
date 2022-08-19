/************************************************************
Name:         Eliana Henderson
Date:         4/14/2022
Assignment:   Payroll
Class Number: 282
Description:  A short program to display payroll information
based on user input.
 ************************************************************/

fun main() {

    print("Enter Employee's name: ")
    var name = readLine()

    print("Enter number of hours worked in a week: ")
    var hours = readLine()!!.toFloat()

    print("Enter hourly pay rate: ")
    var pay = readLine()!!.toFloat()

    print("Enter federal tax withholding rate: ")
    var fedTax = readLine()!!.toFloat()

    print("Enter state tax withholding rate: ")
    var stateTax = readLine()!!.toFloat()

    println()




    println("Employee Name: $name")
    println("Hours Worked: $hours")
    println("Pay Rate: $${"%.2f".format(pay)}")
    println("Gross Pay: $${"%.2f".format(pay * hours)} \n")



    println("Deductions:")
    println("Federal Withholding (${fedTax * 100}%): $${"%.2f".format(fedTax * (pay * hours))}".padStart(38))
    println("State Withholding (${stateTax * 100}%): $${"%.2f".format(stateTax * (pay * hours))}".padStart(34))
    println("Total Deduction: $${"%.2f".format((stateTax * (pay * hours)) + (fedTax * (pay * hours)))}".padStart(26))
    println("Net Pay: $${"%.2f".format((pay * hours) - ((stateTax * (pay * hours)) + (fedTax * (pay * hours))))}")


}