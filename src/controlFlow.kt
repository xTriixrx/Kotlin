package com.qfi

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