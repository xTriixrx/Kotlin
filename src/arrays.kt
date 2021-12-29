package com.qfi

/**
 *  Arrays are used to store multiple items of the same data-type in a single variable, such as an integer or string
 *  under a single variable name. For example, if we need to store names of 1000 employees, then instead of creating
 *  1000 different string variables, we can simply define an array of strings. Like any other modern programming
 *  language, Kotlin also supports arrays and provide a wide range of array properties and support functions.
 */
fun arrayFunc()
{
    println("arrayFunc started.")
    println()

    // To create an array in Kotlin, we use the arrayOf() function, and place the values in a comma-separated list
    var fruits = arrayOf("Apple", "Mango", "Banana", "Orange")
    val duplicateFruits = arrayOf("Apple", "Mango", "Banana", "Orange", "Apple")

    // Optionally, we can provide a data type as follows:
    val stringFruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    print("Array of Fruits - ")
    stringFruits.forEach{ print("$it ") }
    println()

    // Alternatively, the arrayOfNulls() function can be used to create an array of a given size filled with null elements
    val nullFruits = arrayOfNulls<String>(4)
    print("Array of Nulls - ")
    nullFruits.forEach { print("$it ") }
    println()

    // Kotlin also has some built-in factory methods to create arrays of primitive data types
    val numArray = intArrayOf(1, 2, 3, 4)
    print("Integer Array - ")
    numArray.forEach { print("$it ") }
    println()

    val byteArray = byteArrayOf(0x1, 0x2, 0x3)
    print("Byte Array - ")
    byteArray.forEach { print("$it ") }
    println()

    val charArray = charArrayOf('A', 'B', 'C')
    print("Char Array - ")
    charArray.forEach { print("$it ") }
    println()

    val shortArray = shortArrayOf(1, 2, 3)
    print("Short Array - ")
    shortArray.forEach { print("$it ") }
    println()

    val longArray = longArrayOf(1, 2, 3)
    print("Long Array - ")
    longArray.forEach { print("$it ") }
    println()

    // We can access an array element by using the index number inside square brackets.
    // Kotlin array index starts with 0
    println("Fruits index 0 - ${fruits[0]}")
    println("Fruits index 3 - ${fruits[3]}")

    // Kotlin also provides get() and set() member functions to get and set the value at a particular index
    println("Fruits get index 0 - ${fruits.get(0)}")
    println("Fruits get index 3 - ${fruits.get(3)}")
    fruits.set(3, "Guava")
    println("Fruits set index 3 to Guava - ${fruits.get(3)}")

    // Kotlin provides array property called size which returns the size / length of the array
    println("Size of fruits - ${fruits.size}")

    // We can use a for loop to loop through an array
    println("For loop Fruits")
    for (fruit in fruits)
    {
        println(fruit)
    }

    // We can use the in operator along with if...else to check if an element exists in an array
    if ("Mango" in fruits)
    {
        println("Mango exists in fruits")
    }
    else
    {
        println("Mango does not exist in fruits")
    }

    // Kotlin allows to store duplicate values in an array, but at the same time you can get a set of distinct values
    // stored in an array using the distinct() member function
    println("For loop Distinct Fruits")
    for (fruit in duplicateFruits.distinct())
    {
        println(fruit)
    }

    // We can use drop() or dropLast() member functions to drop elements from the beginning or from the last respectively
    val result = fruits.drop(2) // drops first two elements
    val result2 = fruits.dropLast(2) // drops last two elements

    print("Drop first two fruits - ")
    result.forEach{ print("$it ") }
    println()

    print("Drop last two fruits - ")
    result2.forEach{ print("$it ") }
    println()

    // We can use isEmpty() to check if an array is empty or not
    fruits = arrayOf<String>()
    println("Fruits is empty: ${fruits.isEmpty()}")

    println()
    println("arrayFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}