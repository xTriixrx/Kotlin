package com.qfi

// https://www.tutorialspoint.com/kotlin/kotlin_keywords.htm

/* This is a multi-line comment and it can span
 * as many lines as you like 
 /* This is a nested comment */
 // Another nested comment 
 */

/**
 * Multiline comment! main is the entry point of any Kotlin application
 */
fun main(args: Array<String>)
{
    dataTypeFunc()
    
    args.forEach{ print(it + " ") }
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
}