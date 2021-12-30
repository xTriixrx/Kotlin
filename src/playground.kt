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

    collectionsFunc()

    classesFunc()

    constructorsFunc()

    inheritanceFunc()

    abstractFunc()

    if (args.isNotEmpty())
    {
        args.forEach{ print("$it ") }
        println()
        println()
    }

    println("main finished.")
}