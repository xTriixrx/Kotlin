package com.qfi

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