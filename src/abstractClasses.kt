package com.qfi

/**
 * A Kotlin abstract class is similar to a Java abstract class for which it can not be instantiated. This means we
 * cannot create objects of an obstract class. However, we can inherit subclasses from a Kotlin abstract class.
 *
 * A Kotlin abstract class is declared using the abstract keyword in front of the class name. The properties and methods
 * of an abstract class are non-abstract unless we explicitly use the abstract keyword to make them abstract. If we want
 * to override these members in the child class then we just need to use the override keyword in front of them in the
 * child class.
 */

// Abstract classes are always open, You do not need to explicitly use open to inherit subclasses from them
abstract class Individual(_name: String)
{
    var name: String
    abstract var age: Int

    // Initializer Block
    init
    {
        this.name = _name
    }

    abstract fun setPersonAge(_age: Int)
    abstract fun getPersonAge(): Int
    fun getPersonName()
    {
        println("Name = $name")
    }
}

/**
 * Here, a class Employee has been derived from an abstract class Individual. We have implemented one abstract property
 * and two abstract methods in the child class Employee. Here one notable point is that all the abstract members have
 * been overridden in the child class with the override keyword, which is mandatory for a child class if it inherits
 * an abstract class.
 *
 * To summarize, A Kotlin class which contains the abstract keyword in its declaration is known as an abstract class.
 *
 * Abstract classes may or may not contain abstract methods, ie., methods without bodys
 *
 * But, if a class has at least one abstract method, then the class must be declared abstract.
 *
 * If a class is declared abstract, it cannot be instantiated.
 *
 * To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods
 * in it.
 *
 * If you inherit an abstract, you have to provide implementations to all the abstract methods in it.
 */
class Employee(_name: String): Individual(_name)
{
    override var age: Int = 0
    override fun setPersonAge(_age: Int)
    {
        age = _age
    }
    override fun getPersonAge(): Int
    {
        return age
    }
}

/**
 *
 */
fun abstractFunc()
{
    println("abstractFunc started.")
    println()

    var age : Int
    val employee = Employee("Vincent")

    employee.setPersonAge(20)
    age = employee.getPersonAge()
    employee.getPersonName()
    println("Age = $age")

    println()
    println("abstractFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}