package com.qfi

/**
 * In Kotlin, the interface works exactly similar to Java 8, which means they can contain method implementation as well
 * as abstract methods declaration. An interface can be implemented by a class in order to use its defined functionality.
 * The keyword interface is used to define an interface in Kotlin.
 *
 * In this example, we have created on interface and inside we have a couple of abstract properties and methods all together.
 * hello() is an implemented method.
 */
interface ExampleInterface
{
    var myVar: Int // abstract property
    fun absMethod() // abstract method

    // Method with default implementation
    fun hello()
    {
        println("Hello there!")
    }
}

class InterfaceImp: ExampleInterface
{
    override var myVar: Int = 25
    override fun absMethod()
    {
        println("abs() call...")
    }
}

/**
 * As mentioned earlier, Kotlin doesn't support multiple inheritances, however the same thing can be achieved
 * by implementing more than two interfaces at a time.
 */
interface A
{
    fun printMe()
    {
        println("Method of interface A.")
    }
}

interface B
{
    fun printMeToo()
    {
        println("Method of interface B.")
    }
}

class MultipleInterfaceExample: A, B
{

}

/**
 *
 */
fun interfaceFunc()
{
    println("interfaceFunc started.")
    println()

    val obj = InterfaceImp()
    println("My variable value is ${obj.myVar}")
    obj.absMethod()
    obj.hello()

    val obj1 = MultipleInterfaceExample()
    obj1.printMe()
    obj1.printMeToo()

    println()
    println("interfaceFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}