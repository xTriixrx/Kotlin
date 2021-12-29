package com.qfi

/**
 *  Kotlin range is defined by its two endpoint values which are both included in the range. Kotlin ranges are created
 *  with rangeTo() function, or dumpy using downTo() or (..) operator. The main operation on ranges is contains, which
 *  is usually used in the form of in and !in operators.
 */
fun rangesFunc()
{
    println("rangesFunc started.")
    println()

    // 1..10 Range of integers starting from 1 to 10
    // a..z Range of characters starting from a to z
    // A..Z Range of capital characters starting from A to Z

    // To create a Kotlin range we call rangeTo() function on the range start value and provide the end value as an argument

    print("1.rangeTo(4) - ")
    for (num in 1.rangeTo(4))
    {
        print("$num ")
    }
    println()

    // The rangeTo() is often called in its operator form (..) So the above code can be rewritten using the .. operator
    print("1..4 - ")
    for (num in 1..4)
    {
        print("$num ")
    }
    println()

    // If we want to define a backward range we can use the downTo operator
    print("4 downTo 1 - ")
    for (num in 4 downTo 1)
    {
        print("$num ")
    }
    println()

    // We can use the step() function to define the distance between the values of the range
    print("1..10 step 2 - ")
    for (num in 1..10 step 2)
    {
        print("$num ")
    }
    println()

    // Ranges can be created for characters like we have created them for integer values
    print("'a'..'d' - ")
    for (ch in 'a'..'d')
    {
        print("$ch ")
    }
    println()

    // The function reversed() can be used to reverse the values of a range
    print("(1..5).reversed() - ")
    for (num in (1..5).reversed())
    {
        print("$num ")
    }
    println()

    // The function until() can be used to create a range but it will skip the last element given
    print("1 until 5 - ")
    for (num in 1 until 5)
    {
        print("$num ")
    }
    println()

    // We can use first, last, and step properties of a range to find the first, last or step of a range
    println("(5..10).first - ${(5..10).first}")
    println("(5..10 step 2).step - ${(5..10 step 2).step}")
    println("(5..10).last - ${(5..10).last}")

    // The filter() function will return a list of elements matching a given predicate
    val a = 1..10
    val filter = a.filter { T -> T % 2 == 0 }
    println("Filter T -> T % 2 == 0 - $filter")

    // The distinct() function will return a list of distinct values from a range having repeated values:
    val list = listOf(1, 1, 2, 4, 4, 6, 10)
    println("list.distinct() - ${list.distinct()}")

    // There are many other useful functions we can apply to our range, like sum, average, count
    val b = 1..10
    println("b.sum() - ${b.sum()}")
    println("b.average() - ${b.average()}")
    println("b.count() - ${b.count()}")

    println()
    println("rangesFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}