import java.io.File

/************************************************************
Name:         Eliana Henderson
Date:         5/20/2022
Assignment:   Hashmaps
Class Number: 282
Description:  Program that allows user to update data in a products list.
 ************************************************************/

fun main() {

    var fileName = "src/main/kotlin/products.txt"
    var products = hashMapOf<Int, Pair<String, Double>>()
    var inputFD = File(fileName).forEachLine {
        var pieces = it.split(",")
        products[pieces[0].toInt()] = Pair(pieces[1], pieces[2].toDouble())
    }

    var menuChoice = arrayOf(
        "View all products",
        "Add a new product",
        "Delete a product",
        "Update a product",
        "View highest priced product",
        "View lowest priced product",
        "View sum of all product prices",
        "Exit"
    )

    var quit = menuChoice.size
    var userChoice = 0
    while (userChoice != quit) {
        userChoice = menu(menuChoice, "\nPlease enter a selection: ")
        when (userChoice) {
            1 -> printRecords(products)
            2 -> addRecord(products)
            3 -> deleteRecord(products)
            4 -> updateRecord(products)
            5 -> highestPriced(products)
            6 -> lowestPriced(products)
            7 -> sumAll(products)
            8 -> writeToFile(products)
        }
    }
}

fun menu(menuChoice: Array<String>, prompt: String): Int {
    for ((index, choice) in menuChoice.withIndex()) {
        println("${index + 1}. ${choice}")
    }
    print(prompt)

    return readLine()!!.toInt()
}

fun printRecords(products: HashMap<Int, Pair<String, Double>>) {
    println()

    var sortedProducts = products.toSortedMap()

    println("Item     Description     Price")
    println("-----    --------------  ------")

    for ((key, value) in sortedProducts) {
        println("${key.toString().padEnd(8)} ${value.first.padEnd(16)}" + "$${String.format("%.2f", value.second)}")
    }
    println()
}

fun addRecord(products: HashMap<Int, Pair<String, Double>>) {
    println()

    var newKey = (100..999).random()

    if(products.size >= 899) {
        println("Product list is full, please delete a record\n")
    } else {
        while (products.containsKey(newKey)) {
            newKey = (100..999).random()
        }
        print("What is the item you would like to add?: ")
        var newItem = readLine()!!
        print("What is the cost of the ${newItem}?: ")
        var newCost = readLine()!!.toDouble()
        products[newKey] = Pair(newItem, newCost)
        println("New item has been added\n")
    }
}

fun deleteRecord(products: HashMap<Int, Pair<String, Double>>) {
    println()

    print("Please enter the item# of the product: ")
    var removeItem = readLine()!!.toInt()

    if (products.containsKey(removeItem)) {
        products.remove(removeItem)
    } else {
        println("ERROR: Item does not exist")
    }
    println("Item has been removed\n")
}

fun updateRecord(products: HashMap<Int, Pair<String, Double>>) {
    println()

    print("Which item would you like to update?: ")
    var checkKey = readLine()!!.toInt()
    println()

    if (products.containsKey(checkKey)) {
        print("What is the name if the new item?: ")
        var newItem = readLine()!!

        print("What is the new price of the item?: ")
        var newCost = readLine()!!.toDouble()
        println()

        products[checkKey] = Pair(newItem, newCost)
    } else {
        println("ERROR: This item does not exist\n")
    }
}

fun highestPriced(products: HashMap<Int, Pair<String, Double>>) {
    println()

    var highestPrice = Double.MIN_VALUE
    var highestRec = 0

    for ((itemNum, product) in products) {
        if (product.second > highestPrice) {
            highestPrice = product.second
            highestRec = itemNum
        }
    }
    println("Item     Description     Price")
    println("-----    --------------  ------")
    println(
        "${highestRec.toString().padEnd(8)} ${products[highestRec]!!.first.padEnd(16)}" + "$${
            String.format(
                "%.2f",
                products[highestRec]!!.second
            )
        }"
    )
    println()
}

fun lowestPriced(products: HashMap<Int, Pair<String, Double>>) {
    println()

    var lowestPrice = Double.MAX_VALUE
    var lowestRec = 0

    for ((itemNum, product) in products) {
        if (product.second < lowestPrice) {
            lowestPrice = product.second
            lowestRec = itemNum
        }
    }
    println("Item     Description     Price")
    println("-----    --------------  ------")
    println(
        "${lowestRec.toString().padEnd(8)} ${products[lowestRec]!!.first.padEnd(16)}" + "$${
            String.format(
                "%.2f",
                products[lowestRec]!!.second
            )
        }"
    )
    println()
}

fun sumAll(products: HashMap<Int, Pair<String, Double>>) {
    println()

    var totalPrice = 0.toDouble()

    for ((itemNum, product) in products) {
        totalPrice += product.second
    }

    println("The total sum of your products is $${String.format("%.2f", totalPrice)}\n")
}

fun writeToFile(products: HashMap<Int, Pair<String, Double>>) {
    print("Saving records")
    var fileName = "src/main/kotlin/products.txt"
    var fd = File(fileName).printWriter() // printWriter rewrites the file
    for ((itemNum, product) in products) {
        fd.println("${itemNum},${product.first.trimStart()},${product.second}")
    }
    fd.close()
}