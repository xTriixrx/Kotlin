package com.qfi

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