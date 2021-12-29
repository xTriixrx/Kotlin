package com.qfi

/**
 * Kotlin supports both functional and object-oriented programming. While talking about functional features of Kotlin
 * then we have concepts like functions, higher-order functions, lambdas, etc. which represent Kotlin as a functional
 * language. Kotlin also supports Object Oriented Programming (OOP) and provides features such as abstraction, encapsulation,
 * inheritance, etc.
 *
 * A class is a blueprint for the objects which defines a template to be used to create the required object instances.
 * Classes are the main building blocks of any Object Oriented Programming language. A Kotlin class is defined using
 * the class keyword. By default, Kotlin classes are public and we can control the visibility of the class members
 * using different modifiers that we will learn about in Visibility Control.
 */

class ClassName
{
    public var counter: Int = 0
    private var name: String = "ClassName"

    public fun className(): String
    {
        return this.name
    }
}

/**
 *
 */
fun classesFunc()
{
    // The objects are created from the Kotlin class and they share the common properties and behaviors defined by a
    // class in form of data members (properties) and member functions (behaviours) respectively.

    // To declare an object type and instantiate (can be simplified to var varName = ClassName())
    var varName: ClassName
    varName = ClassName()

    // We can access the properties and methods of a class instance using the dot (.) operator
    println("ClassName counter property: ${varName.counter}")
    println("ClassName function: ${varName.className()}")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}
