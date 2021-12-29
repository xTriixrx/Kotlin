package com.qfi

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