package com.qfi

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
