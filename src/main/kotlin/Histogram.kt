/************************************************************
Name:         Eliana Henderson
Date:         5/8/2022
Assignment:   Histogram
Class Number: 282
Description:  A program to randomly generate 200 numbers and display them histogram style
 ************************************************************/

fun main() {
    //Create Array to sort random numbers into
    var randomNum = intArrayOf()
    //Create Array to increment the numbers of int found in range
    var buckets = arrayOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    //For 200 loops add random int into array
    for (num in 0..199) {
        randomNum += (1..100).random()

        //when int falls within 1..100 step 10 and increment corresponding array index
        when (randomNum[num]) {
            in 1..10 -> buckets[0]++
            in 11..20 -> buckets[1]++
            in 21..30 -> buckets[2]++
            in 31..40 -> buckets[3]++
            in 41..50 -> buckets[4]++
            in 51..60 -> buckets[5]++
            in 61..70 -> buckets[6]++
            in 71..80 -> buckets[7]++
            in 81..90 -> buckets[8]++
            in 91..100 -> buckets[9]++
        }
    }
    //print chart with padding and show * and number found for each range using array buckets.
    println(
        "Range".padEnd(13) + "# Found".padEnd(14) + "Chart \n" + "-".repeat(8).padEnd(13) + "-".repeat(10)
            .padEnd(14) + "-".repeat(43) + "\n 1 -  10".padEnd(15) + "|  " + "${buckets[0]}".padStart(2) + "  |".padEnd(
            8
        ) + "*".repeat(buckets[0]) + "\n11 -  20".padEnd(15) + "|  " + "${buckets[1]}".padStart(2) + "  |".padEnd(8) + "*".repeat(
            buckets[1]
        ) + "\n21 -  30".padEnd(15) + "|  " + "${buckets[2]}".padStart(2) + "  |".padEnd(8) + "*".repeat(buckets[2]) + "\n31 -  40".padEnd(
            15
        ) + "|  " + "${buckets[3]}".padStart(2) + "  |".padEnd(8) + "*".repeat(buckets[3]) + "\n41 -  50".padEnd(15) + "|  " + "${buckets[4]}".padStart(
            2
        ) + "  |".padEnd(8) + "*".repeat(buckets[4]) + "\n51 -  60".padEnd(15) + "|  " + "${buckets[5]}".padStart(2) + "  |".padEnd(
            8
        ) + "*".repeat(buckets[5]) + "\n61 -  70".padEnd(15) + "|  " + "${buckets[6]}".padStart(2) + "  |".padEnd(8) + "*".repeat(
            buckets[6]
        ) + "\n71 -  80".padEnd(15) + "|  " + "${buckets[7]}".padStart(2) + "  |".padEnd(8) + "*".repeat(buckets[7]) + "\n81 -  90".padEnd(
            15
        ) + "|  " + "${buckets[8]}".padStart(2) + "  |".padEnd(8) + "*".repeat(buckets[8]) + "\n91 - 100".padEnd(15) + "|  " + "${buckets[9]}".padStart(
            2
        ) + "  |".padEnd(8) + "*".repeat(buckets[9])
    )
}