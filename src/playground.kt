package com.qfi

import java.util.Arrays

// https://www.tutorialspoint.com/kotlin/index.htm

/* This is a multi-line comment and it can span
 * as many lines as you like 
 /* This is a nested comment */
 // Another nested comment 
 */

val MAX_LINE_OUT = 100

/**
 * Multiline comment! main is the entry point of any Kotlin application
 */
fun main(args: Array<String>)
{
    variablesFunc()

    dataTypeFunc()

    operatorsFunc()

    booleanFunc()

    stringsFunc()

    arrayFunc()

    args.forEach{ print(it + " ") }
}

/**
 * Variable naming rules:
 * Kotlin variable names can contain letters, digits, underscores, and dollar signs.
 * Kotlin variable names should start with a letter, $ or underscores
 * Kotlin variables are case sensitive which means Zara and ZARA are two different variables.
 * Kotlin variable can not have any white space or other control characters.
 * Kotlin variable can not have names like var, val, String, Int because they are reserved keywords in Kotlin.
 */
fun variablesFunc()
{
    println("variablesFunc")
    // val variables are read-only, and should only be used to define constants that will remain the same
    val name = "Vincent"
    
    // var variables are mutable, so they can be changed throughout the programs lifecycle
    var age = 24

    val raw = """Kotlin variable names can contain letters, digits, underscores, and dollar signs.
        Kotlin variable names should start with a letter, ${'$'} or underscores
        Kotlin variables are case sensitive which means Zara and ZARA are two different variables.
        Kotlin variable can not have any white space or other control characters.
        Kotlin variable can not have names like var, val, String, Int because they are reserved keywords in Kotlin."""
    println(raw)
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * To convert a numeric data type to another type, Kotlin provides a set of functions:
 * toByte()
 * toShort()
 * toInt()
 * toLong()
 * toFloat()
 * toDouble()
 * toChar()
 */
fun dataTypeFunc()
{
    var byteType: Byte = 0x1 // 8 bit
    var intType: Int = 10000 // 32 bit
    var shortType: Short = 0xA // 16 bit
    var longType: Long = 100000L // 64 bit
    var floatType: Float = 10.123F // 32 bit
    var doubleType: Double = 10.123 // 64 bit

    println("dataTypeFunc")

    println("Byte type value: $byteType")
    println("Int type value: $intType")
    println("Short type value: $shortType")
    println("Long type value: $longType")
    println("Float type value: $floatType")
    println("Double type value: $doubleType")

    var charType: Char = 'A'
    var boolType: Boolean = true
    var strType: String = "Test string!"

    println("Char type value: $charType")
    println("Boolean type value: $boolType")
    println("String type value: $strType")

    var escapedString: String = "This is an escaped string!\n"
    var rawString: String = """This is a going to be a
    multi-line string and will not
    have any escape sequences"""

    print(escapedString)
    println(rawString)
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin Operators
 */
fun operatorsFunc()
{
    println("Kotlin Operators")

    println("Arithmetic Operators: +, -, *, /, %")
    // Arithmetic Operators: +, -, *, /, %
    var x: Int = 40
    var y: Int = 20
    var bx: Boolean = true
    var by: Boolean = false

    println("x + y = " + (x + y))
    println("x - y = " + (x - y))
    println("x / y = " + (x / y))
    println("x * y = " + (x * y))
    println("x % y = " + (x % y))
    println()

    println("Relational Operators: >, <, >=, <=, ==, !=")
    // Relational Operators: >, <, >=, <=, ==, !=

    println("x > y = " + (x > y))
    println("x < y = " + (x < y))
    println("x >= y = " + (x >= y))
    println("x <= y = " + (x <= y))
    println("x == y = " + (x == y))
    println("x != y = " + (x != y))
    println()

    println("Assignment Operators: =, +=, -=, *=, /=, %=")
    // Assignment Operators: =, +=, -=, *=, /=, %=

    x += 5
    println("x += 5 = " + x)
    x = 40
    x -= 5
    println("x += 5 = " + x)
    x = 40
    x *= 5
    println("x += 5 = " + x)
    x = 40
    x /= 5
    println("x += 5 = " + x)
    x = 40
    x %= 5
    println("x += 5 = " + x)
    x = 40
    println()

    println("Unary Operators: +, -, ++, --, !")
    // Unary Operators: +, -, ++, --, !

    println("+x = " + (+x))
    x = 40
    println("-x = " + (-x))
    x = 40
    println("++x = " + (++x)) // ++ supports prefix & postfix
    x = 40
    println("--x = " + (--x)) // -- supports prefix & postfix
    println()

    println("Logical Operators: &&, ||, !")
    // Logical Operators: &&, ||, !
    println("x && y = " + (bx && by))
    println("x || y = " + (bx || by))
    println("!y = " + (!by))
    println()

    println("Kotlin Bitwise Operations: shl(bits), shr(bits), ushr(bits), and(bits), or(bits), xor(bits), inv()")
    //  Kotlin Bitwise Operations: shl(bits), shr(bits), ushr(bits), and(bits), or(bits), xor(bits), inv()
    x = 60 // 0011 1100
    y = 13 // 0000 1101

    println("x.shl(2) = " + x.shl(2)) // 240 = 1111 0000
    println("x.shr(2) = " + x.shr(2)) // 15 = 0000 1111
    println("x.and(y) = " + x.and(y)) // 12 = 0000 1100
    println("x.or(y) = " + x.or(y)) // 61 = 0011 1101
    println("x.xor(y) = " + x.xor(y)) // 49 = 0011 0001
    println("x.inv() = " + x.inv()) // -61 1100 0011
    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * A boolean variable can be created using the Boolean keyword and this variable can only take the values either true
 * or false (Kotlin's type inference can also figure it out).
 */
fun booleanFunc()
{
    // Kotlin boolean operators: &&, ||, !
    var x: Boolean = true
    var y: Boolean = false

    println("Kotlin Booleans")
    println("Kotlin Boolean Operator Expressions")

    println("x && y = " + (x && y))
    println("x || y = " + (x || y))
    println("!y = " + (!y))
    println()

    println("Kotlin Logical Operations")
    println("Logical functions cannot perform short-circuit evaluation but always evaluate both operands.")
    println("x.and(y) = " + x.and(y))
    println("x.or(y) = " + x.or(y))
    println("x.xor(y) = " + x.xor(y))
    println("x.not() = " + x.not())
    println()

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin strings can be stored in either double quotes (" ") or triple quotes (""" """). We have two kinds of strings
 * available in Kotlin - escaped strings and raw strings. Escaped strings are declared with double quotes and may contain
 * escape characters like \n, \t, \b, etc. whereas raw strings are declared with triple quotes and may contain multiple
 * lines of text without any escape characters.
 */
fun stringsFunc()
{
    // Kotlin string templates are pieces of code that are evaluated and whose results are interpolated into the string.
    // A template expression starts with a dollar sign ($) and may consist of either a name or an expression.

    val apple: String = "Apple"
    val str2: String = "It's OK"
    val lastName: String = "Nigro"
    val str1: String = "That's it"
    val firstName: String = "Vincent "
    val name: String = "Vincent Nigro"
    val str: String = "Meditation and Yoga are synonymous with India"

    println("Name - $name")
    println("Name length - ${name.length}") // Need ${} when using template with an expression

    // Kotlin String is an object, which contains a number of properties and functions that can perform certain operations
    // on strings, by writing a dot character (.) after the specific string variable.
    // We will see some of the important properties and functions in this chapter, remaining ones can be found in official
    // documentation of Kotlin's latest release.

    // Kotlin Strings can be treated as a sequence or array of characters and can access its elements by specifying the index:
    println("Fourth character of name - ${name[3]}")
    println("Sixth character of name = ${name[5]}")

    // We can use the length property of Kotlin strings to find out its length
    println("Name length - ${name.length}")

    // Kotlin provides uppercase() and lowercase() functions for converting string casing
    println("Uppercase name - ${name.uppercase()}")
    println("Lowercase name - ${name.lowercase()}")

    // We can use either + operator or plus() function to concatenate two strings
    println("Concatenated Name '+' - " + firstName + lastName)
    println("Concatenated Name 'plus()' - ${firstName.plus(lastName)}")

    // Can remove first few or last few characters from a string using drop() or dropLast() functions
    println("Remove first two characters from name - ${name.drop(2)}")
    println("Remove last two characters from name - ${name.dropLast(2)}")

    // Kotlin provides indexOf() function to find out a text inside a string. This function returns the index of the
    // first occurrence of a specified text in a string
    println("Index of Yoga in the string - " + str.indexOf("Yoga"))

    // Kotlin provides compareTo() to compare two strings. Function returns 0 if equal otherwise returns 1.
    println("Apple == Apple - ${apple.compareTo("Apple")}")
    println("Apple == apple (case insensitive) - ${apple.compareTo("apple", ignoreCase = true)}")

    // Kotlin getOrNull() function returns a character at the given index or null if the index is out of bounds of this char sequence.
    println("getOrNull(0) - ${name.getOrNull(0)}")
    println("getOrNull(2) - ${name.getOrNull(2)}")
    println("getOrNull(100) - ${name.getOrNull(100)}")

    // Kotlin toString() returns a string representation of an object

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 *  Arrays are used to store multiple items of the same data-type in a single variable, such as an integer or string
 *  under a single variable name. For example, if we need to store names of 1000 employees, then instead of creating
 *  1000 different string variables, we can simply define an array of strings. Like any other modern programming
 *  language, Kotlin also supports arrays and provide a wide range of array properties and support functions.
 */
fun arrayFunc()
{
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
    println("-".repeat(MAX_LINE_OUT))
    println()
}