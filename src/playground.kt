package com.qfi

// https://www.tutorialspoint.com/kotlin/kotlin_keywords.htm

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