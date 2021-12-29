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

typealias User = Triple<String, String, Int>

interface Human { fun think() }

class ClassName
{
    public var counter: Int = 0
    private var name: String = "ClassName"

    public fun className(): String
    {
        return this.name
    }

    /**
     * By definition, when a class has been created inside of another class then it is called a nested class.
     */
    class NestedClass
    {
        fun foo(): String
        {
            return "Inside the nested class."
        }
    }

    inner class InnerClass
    {
        fun bar(): String
        {
            return name
        }
    }
}

/**
 *
 */
fun classesFunc()
{
    println("classesFunc started.")
    println()

    // The objects are created from the Kotlin class and they share the common properties and behaviors defined by a
    // class in form of data members (properties) and member functions (behaviours) respectively.

    // To declare an object type and instantiate (can be simplified to var varName = ClassName())
    var varName: ClassName
    varName = ClassName()

    // We can access the properties and methods of a class instance using the dot (.) operator
    println("ClassName counter property: ${varName.counter}")
    println("ClassName function: ${varName.className()}")

    // Kotlin nested classes by default are static, hence, it can be accessed without creating any object of that
    // class but with the help of the dot operator. At the same time we cannot access members of the outer class
    // inside of the nested class.

    val nested = ClassName.NestedClass()
    println(nested.foo())

    // When a nested class is marked with a keyword inner, then it will be called as an inner class. An inner class
    // can be accessed by the data members of the outer class.
    // Unlike a nested class, inner classes can access members of the outer class. We cannot directly create an object
    // of the inner class but it can be created using the outer class object.

    val innerClass = varName.InnerClass()
    println("Inner class bar function: ${innerClass.bar()}")

    // Anonymous inner classes are a pretty good concept that make the life of a programmer easier. Whenever we are
    // implementing an interface, the concept of anonymous inner blocks come into picture. The concept of creating
    // an object of interface using runtime object reference is known as an anonymous class.
    var programmer: Human =
        object:Human
    {
        // Anonymous class
        override fun think()
        {
            // overriding the think method
            println("I am an example of an anonymous class.")
        }
    }

    programmer.think()

    // Kotlin Type Aliases means a way to give an alternative name to an existing type. Type alias provides a
    // cleaner way to write more readable code.
    // Consider the function userInfo which returns a Triple<String, String, Int>, to make this more readable we
    // can use a type alias

    val userInfo: User = userInfo()
    println(userInfo)

    println()
    println("classesFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}

//fun userInfo(): Triple<String, String, Int>
//{
//    return Triple("Vincent", "Nigro", 24)
//}

fun userInfo(): User
{
    return Triple("Vincent", "Nigro", 24)
}