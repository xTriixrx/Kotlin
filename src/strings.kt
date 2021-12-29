package com.qfi

/**
 * Kotlin strings can be stored in either double quotes (" ") or triple quotes (""" """). We have two kinds of strings
 * available in Kotlin - escaped strings and raw strings. Escaped strings are declared with double quotes and may contain
 * escape characters like \n, \t, \b, etc. whereas raw strings are declared with triple quotes and may contain multiple
 * lines of text without any escape characters.
 */
fun stringsFunc()
{
    println("stringsFunc started.")
    println()

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
    println("stringsFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}