package com.qfi

/**
 * This type of class is used to represent a restricted class hierarchy. Sealed allows the developers to maintain a
 * data type of a predefined type. To make a sealed class, we need to use the keyword "sealed" as a modifier of that
 * class. A sealed class can have its own subclass but all those subclasses need to be declared inside the same Kotlin
 * file along with the sealed class.
 */
sealed class MySealedExample
{
    class OP1 : MySealedExample()
    {

    }

    class OP2 : MySealedExample()
}

/**
 * In the above example, we have one sealed class named “MyExample”, which can be of two types only - one is “OP1”
 * and another one is “OP2”. In the main class, we are creating an object in our class and assigning its type at
 * runtime. Now, as this “MyExample” class is sealed, we can apply the “when ” clause at runtime to implement
 * the final output.
 *
 * In sealed class, we need not use any unnecessary “else” statement to complex out the code.
 */
fun sealedClassesFunc()
{
    println("sealedClassesFunc started.")
    println()

    var obj: MySealedExample = MySealedExample.OP1()

    val output = when (obj)
    {
        is MySealedExample.OP1 -> "Option one has been chosen."
        is MySealedExample.OP2 -> "Option two has been chosen."
    }

    println(output)

    println()
    println("sealedClassesFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}