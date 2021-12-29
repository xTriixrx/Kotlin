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
    println("main started.")
    println()

    variablesFunc()

    dataTypeFunc()

    operatorsFunc()

    booleanFunc()

    stringsFunc()

    arrayFunc()

    rangesFunc()

    functionsFunc()

    ifElseControlFlowFunc()

    whenControlFlowFunc()

    forControlFlowFunc()

    whileControlFlowFunc()

    breakAndContinueControlFlowFunc()

    if (args.isNotEmpty())
    {
        args.forEach{ print("$it ") }
        println()
        println()
    }

    println("main finished.")
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
    println("variablesFunc started.")
    println()

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

    println()
    println("variablesFunc finished.")

    println()
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
    println("dataTypeFunc started.")
    println()

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

    println()
    println("dataTypeFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin Operators
 */
fun operatorsFunc()
{
    println("operatorsFunc started.")
    println()

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
    println("operatorsFunc finished.")

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
    println("booleanFunc started.")
    println()

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
    println("booleanFunc finished.")

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

/**
 * Kotlin is a statically typed language, hence functions play a great role in it. A function is a block of code which
 * is written to perform a particular task. Functions are supported by all the modern programming languages. At a broad
 * level, a function takes some input which is called parameters, perform certain actions on these inputs and finally returns
 * a value.
 *
 * Kotlin provides a number of built-int functions, we hae used a number of them such as print() and println() which are
 * used to print an output to the screen.
 *
 * Kotlin also allows us to create our own functions using the keyword fun. A user defined function takes zero or more
 * parameters, perform an action and return the result of that action as a value.
 */
fun functionsFunc()
{
    println("functionsFunc started.")
    println()

    val a = 10
    val b = 20
    var result = 0

    functionName()

    // The following is an example of a user defined function which will add two given numbers and print their sums
    printSum(a, b)

    // A kotlin function returns a value based on requirement, it is optional to return a value. To return a value, use
    // the return keyword and specify the return type after the function's parentheses
    result = sumTwo(a, b)
    println("sumTwo(a, b) - $result")

    // If a function does not return a useful v alue, its return type is Unit. Unit is a type with only one value which
    // is Unit
    returnUnit()

    // Recursion is supported by Kotlin
    result = recursiveFactorial(4)
    println("recursiveFactorial(4) - $result")

    // Kotlin prefers tail recursion when performing processing on large numbers to avoid java.lang.StackOverflowError
    result = tailRecursiveFactorial(4)
    println("tailRecursiveFactorial(4) - $result")

    // A higher-order function is a function that takes another function as parameter and/or returns a function
    // Following is a function which takes two integer parameters and additionally, it takes another function operation
    // as a parameter. Here, :: is the notation that references a function by name in Kotlin

    // Calculates the sum of a + b
    result = calculate(a, b)
    println("calculate(a, b) - $result")

    // Calculates the difference between b - a
    result = calculate(b, a, ::minus)
    println("calculate(b, a, ::minus) - $result")

    // Calculates the multiplication of a * b
    result = calculate(a, b, ::times)
    println("calculate(a, b, ::times) - $result")

    // Kotlin lambda is a function which has no name and defined with curly braces '{}' which takes zero or more parameters
    // and a body of a function
    // {variable with type -> body of the function}

    val upperCase = {str: String -> str.uppercase()}
    println("upperCase(\"hello world lambda!\") - ${upperCase("hello world lambda!")}")

    // An inline Kotlin function is declared with the inline keyword. The use of inline functions enhances the performance
    // of higher order functions. The inline function tells the compiler to copy parameters and functions to the call site.
    val lambda = {println("Inline function parameter")}
    myInlineFunction(lambda)

    println()
    println("functionsFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

fun functionName()
{
    // body of a function
}

fun printSum(a: Int, b: Int)
{
    println("printSum(a, b) - ${a + b}")
}

fun sumTwo(a: Int, b: Int): Int
{
    return a + b
}

fun returnUnit(): Unit
{
    // Same as not declaring Unit as return type
}

fun recursiveFactorial(a: Int): Int
{
    val result: Int

    if (a <= 1)
    {
        result = a
    }
    else
    {
        result = a * recursiveFactorial(a - 1)
    }

    return result
}

fun tailRecursiveFactorial(a: Int, accum: Int = 1): Int
{
    val result = a * accum

    return if (a <= 1)
    {
        result
    }
    else
    {
        tailRecursiveFactorial(a - 1, result)
    }
}

// A function which accepts 2 parameters, and 1 optional parameter which by default is the sum function.
fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int = ::sum): Int
{
    return operation(a, b)
}

inline fun myInlineFunction(function: () -> Unit)
{
    println("I am inline function - A")
    function()
    println("I am inline function - B")
}

fun sum(a: Int, b: Int) = a + b
fun minus(a: Int, b: Int) = a - b
fun times(a: Int, b: Int) = a * b

/**
 * Kotlin flow control statements determine the next statement to be executed. Kotline if..else expressions work like
 * in any other modern computer programming language.
 */
fun ifElseControlFlowFunc()
{
    println("ifElseControlFlowFunc started.")
    println()

    val value: Int = 2
    val condition: Boolean = true

    // The syntax of a traditional if...else expression is as follows:
    if (condition)
    {
        // code block will be executed if true
        println("Condition is true")
    }
    else
    {
        // code block will be executed if false
        println("Condition is false")
    }

    // You can use else if statements for multiple condition checks
    if (value == 1)
    {
        println("Value is equal to 1.")
    }
    else if (value == 2)
    {
        println("Value is equal to 2.")
    }
    else
    {
        println("Value is equal to something else.")
    }

    // Kotlin also supports nested if statements
    if (condition)
    {
        if (value == 2)
        {
            println("Condition is true and value is equal to 2.")
        }
    }

    println()
    println("ifElseControlFlowFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin flow control statements determine the next statement to be executed. Consider a situation when you have a large
 * number of conditions to check. Though you can use if...else if expressions to handle the situation, but Kotlin provides
 * when expressions to handle the situation in a nicer way. Using when expressions are far easier and more clean in
 * comparison to writing many if...else if expressions. Kotlin when expressions evaluate a section of code among many
 * alternatives. Kotlin when expression is similar to the switch statement in C, C++, and Java.
 */
fun whenControlFlowFunc()
{
    println("whenControlFlowFunc started.")
    println()

    val day = 2
    val x = 20
    val y = 10
    val z = 10
    var result: String = ""

    // Kotlin when can be used either as an expression or as a statement, simply like a switch statement in Java.
    // If it is used as an expression, the value of the first matching branch becomes the value of the overall expression

    result = when (day) {1 -> "Monday" 2 -> "Tuesday" 3 -> "Wednesday" else -> "Invalid day."}
    println("whenDay(2) - $result")

    // We can combine multiple when conditions into a single condition
    when (day)
    {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }

    // Kotlin ranges are created using the double dots '..' and we can use them while checking when conditions with the
    // help of the in operator.
    when (day)
    {
        in 1..5 -> println("Weekday")
        else -> println("Weekend")
    }

    // Kotlin when can use arbitrary expressions instead of a constant as branch condition
    when (x)
    {
        (y + z) -> println(" y + z = x = $x")
        else -> println("Condition is not satisfied.")
    }

    // Kotlin when branches can be put as block of code enclosed within curly braces

    when (day)
    {
        1 ->
        {
            println("First day of the week")
            println("Monday")
        }
        2 ->
        {
            println("Second day of the week")
            println("Tuesday")
        }
        else -> println("Different day.")
    }

    println()
    println("whenControlFlowFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin flow control statements determine the next statement to be executed. Kotlin for loops iterates through anything
 * that provides an iterator ie. that contains a countable number of values, for example arrays, ranges, maps, or any other
 * collection available in Kotlin. Kotlin's for loop is equivalent to the foreach loop in languages like C#. Kotlin does
 * not provide a conventional for loop which is available in C, C++, and Java.
 */
fun forControlFlowFunc()
{
    println("forControlFlowFunc started.")
    println()

    var fruits = arrayOf("Orange", "Apple", "Mango", "Banana")
    // Kotlin Ranges provide an iterator, so we can iterate through a range using a for loop
    for (item in 1..5)
    {
        print("$item ")
    }
    println()

    for (item in 5 downTo 1 step 2)
    {
        print("$item ")
    }
    println()

    // Kotlin Arrays are another data type which provides an iterator, so we can use the for loop to iterate through
    // a Kotlin array in the similar way as we did it for the ranges.

    for (index in fruits.indices)
    {
        print("${fruits[index]} ")
    }
    println()

    for (fruit in fruits)
    {
        print("$fruit ")
    }
    println()

    println()
    println("forControlFlowFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin flow control statements determine the next statement to be executed. Kotlin while loop executes it body
 * continuously as long as the specified condition is true.
 */
fun whileControlFlowFunc()
{
    println("whileControlFlowFunc started.")
    println()

    var i = 5;
    var condition: Boolean = false

    while (condition)
    {
        // Body of the loop
    }

    while (i > 0)
    {
        print("${i--} ")
    }
    println()

    // The do while loop is similar to the while loop with a difference that this loop will execute the code block once,
    // before checking if the condition is true or not.

    do
    {
        println("Executing body of do while loop once.")
    } while (condition)

    println()
    println("whileControlFlowFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

/**
 * Kotlin flow control statements determine the next statement to be executed. Kotlin break statement is used to come
 * out of a loop once a certain condition is met. This loop could be a for, while, or do...while loop.
 */
fun breakAndContinueControlFlowFunc()
{
    println("breakAndContinueControlFlowFunc started.")
    println()

    var i = 0
    val test: Boolean = true

    while (i++ < 100)
    {
        if (i == 3)
        {
            println("Breaking out of while loop...")
            break
        }
    }

    // Kotlin label is the form of identifier followed by the @ sign, for example test@ or outer@. To make any Kotlin
    // Expression as a labeled one, we just need to put a label in front of the expression

    testLoop@
    for (i in 1..10)
    {
        // Do nothing
    }

    // Kotlin labeled break statement is used to terminate the specific loop. This is done by using break expression with
    // the @ sign followed by label name (break@LabelName)

    outerLoop@ for (i in 1..3)
    {
        innerLoop@
        for (j in 1..3)
        {
            if (i == 2)
            {
                break@outerLoop
            }

            println("i = $i and j = $j")
        }
    }

    // The Kotlin continue statement breaks the loop iteration in between (skips the part next to the continue statement
    // til the end of the loop) and continues with the next iteration of the loop

    i = 0

    while (i++ < 6)
    {
        if (i == 3)
        {
            continue
        }

        print("$i ")
    }
    println()

    // Kotlin labeled continue statements is used to skip the part of a specific loop. This is done by using continue
    // expression with the @ sign followed by the label name (continue@labelName)

    outerLoop@
    for (i in 1..3)
    {
        innerLoop@
        for (j in 1..3)
        {
            if (i == 2)
            {
                continue@outerLoop
            }

            println("i = $i and j = $j")
        }
    }

    println()
    println("breakAndContinueControlFlowFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}