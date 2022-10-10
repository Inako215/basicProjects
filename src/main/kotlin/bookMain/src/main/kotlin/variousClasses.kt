/************************************************************
Name:         Eliana Henderson
Date:         10/02/2022
Assignment:   Various Classes
Class Number: 283
Description:  A small program that creates multiple classes and tests the functionality of the attributes/methods
using the objects instantiated from the class.
 ************************************************************/

class Person(var firstName: String, var lastName: String, var age: Int, var hairColor: String, var eyeColor: String) {
    override fun toString(): String {
        return "PERSON: \n" + " ".repeat(4) + "First Name: $firstName \n" + " ".repeat(4) + "Last Name" + " " + ": $lastName \n" + " ".repeat(
            4
        ) + "Age" + " ".repeat(7) + ": $age \n" + " ".repeat(4) + "Hair Color: $hairColor \n" + " ".repeat(4) + "Eye Color" + " " + ": $eyeColor"
    }
}

class Address(var line1: String, var line2: String, var city: String, var state: String, var zip: String) {
    override fun toString(): String {
        return "ADDRESS: \n" + " ".repeat(4) + "Line1 : $line1 \n" + " ".repeat(4) + "Line2 : $line2 \n" + " ".repeat(
            4
        ) + "City" + " ".repeat(2) + ": $city \n" + " ".repeat(4) + "State : $state \n" + " ".repeat(4) + "Zip" + " ".repeat(
            3
        ) + ": $zip"
    }
}

class Character(var name: String, var race: String, var hitPoints: Int, var gold: Int) {

    var weapons = mutableListOf<String>()
    var clothing = mutableListOf<String>()

    fun addWeapon(weapon: String) {
        weapons.add(weapon)
    }

    fun addClothing(item: String) {
        clothing.add(item)
    }

    fun dropWeapon(weapon: String) {
        weapons.remove(weapon)
    }

    fun dropClothing(item: String) {
        clothing.remove(item)
    }

    fun retWeapon(): String {
        return weapons.joinToString()
    }

    fun retClothing(): String {
        return clothing.joinToString()
    }


    override fun toString(): String {
        return "CHARACTER: \n" + " ".repeat(4) + "Name" + " ".repeat(6) + ": $name \n" + " ".repeat(4) + "Race" + " ".repeat(
            6
        ) + ": $race \n" + " ".repeat(4) + "HitPoints " + ": $hitPoints \n" + " ".repeat(4) + "Gold" + " ".repeat(6) + ": $gold \n" + " ".repeat(
            4
        ) + "Weapons" + " ".repeat(3) + ": ${retWeapon()} \n" + " ".repeat(4) + "Clothing" + " ".repeat(2) + ": ${retClothing()}"
    }
}


fun main() {
    var a = Person("Eliana", "Henderson", 24, "Brown", "Hazel")
    println(a)
    println()
    a.firstName = "Kevin"
    a.lastName = "Stacy"
    a.age = 33
    a.hairColor = "Blonde"
    a.eyeColor = "Blue"
    println(a)
    println()

    var b = Address("420 E Broad Ave", "", "Spokane", "WA", "99207")
    println(b)
    println()
    b.line1 = "13310 E Mission Ave"
    b.line2 = "Apt 1"
    b.city = "Spokane Valley"
    b.zip = "99216"
    println(b)
    println()

    var c = Character("Dellantra", "Night Elf", 1000, 5000)
    c.addWeapon("Bow")
    c.addWeapon("Whip")
    c.addClothing("Leather Cloak")
    c.addClothing("Leather Gloves")
    println(c)
    println()
    c.name = "Carmen Sandiego"
    c.race = "Human"
    c.hitPoints = 50
    c.gold = 20
    c.dropWeapon("Bow")
    c.dropClothing("Leather Gloves")
    c.dropClothing("Leather Cloak")
    c.addClothing("Red Trench Coat")
    c.addClothing("Big Red Fedora")
    println(c)
}