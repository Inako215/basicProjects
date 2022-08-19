/************************************************************
Name:         Eliana Henderson
Date:         5/30/2022
Assignment:   Acronym
Class Number: 282
Description:  A program that takes a phrase as user input and return an acronym
 ************************************************************/

fun main() {

    print("Please enter a phrase: ")
    var phrase = readLine()!!

    var acronym = acronym(phrase)
    print("Your acronym is $acronym")

}

fun acronym(phrase: String) :String {
    var splitPhrase = phrase.split("\\s+".toRegex())
    var acronym = ""

    splitPhrase.forEach() {
        acronym += it.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }.first()
    }
    return acronym
}