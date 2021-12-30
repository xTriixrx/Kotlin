package com.qfi

/**
 * Inheritance can be  defined as the process where one class acquires the members (methods and properties) of another
 * class. With the use of inheritance the information is made manageable in a hierarchical order. A class which inherits
 * the members of another class is known as a subclass (derived or child class) and the class whose members are being
 * inherited is known as the superclass (base class or parent class).
 *
 * Inheritance is one of the key features of object-oriented programming which allows a user to create a new class from
 * an existing class. Inheritance we can inherit all the features from the base class and can have additional features
 * of its own as well.
 *
 * All classes in Kotlin have a common superclass, called Any, which is the default superclass for a class with no
 * supertype declared
 */

/**
 * Kotlin superclass Any has 3 methods, equals(), hashCode(), and toString(). Thus, these methods are defined for
 * all Kotlin classes.
 */
class Example
{

}

/**
 * Everything in Kotlin is by default final, hence, we need to use the keyword open in front of the class declaration
 * to make it inheritable for other classes. Kotlin uses operator ':' to inherit a class
 */
open class ABC
{
    open val count: Int = 0

    open fun think()
    {
        println("Hey! I am thinking!")
    }

    open fun foo()
    {
        println("Inside ABC!")
    }

    open fun displayCount(): Int
    {
        return count
    }
}

/**
 * To override a method in the child class we need the override keyword. The overriding mechanism works on properties
 * in the same way that it does on methods. Properties declared on a superclass that are then re-declared on a derived
 * class must be prefaced with the keyword override, and they must have a compatible type.
 */
class BCD: ABC()
{
    override var count: Int = 100

    override fun foo()
    {
        println("Inside BCD!")
    }
}

/**
 * We can also use the override keyword as part of the property declaration in a primary constructor. Following example
 * makes the use of the primary constructor to override the count property, which will take 400 as the default value.
 */
class EFG(override var count: Int = 400): ABC()
{

}

/**
 * When we create an object of a derived class the constructor initialization starts from the base class. Which means
 * first of all base class properties will be initialized, after that any derived class constructors will be called and
 * same applies to any further derived classes. This means that when the base class constructor is executed, the properties
 * declared or overriden in the derived class have not yet been initialized.
 */
open class Base
{
    init
    {
        println("I am in Base class")
    }
}

open class Child: Base()
{
    open val name: String

    init
    {
        name = "Child"
        println("I am in Child class")
    }

    open fun displayName()
    {
        println("I am in " + this.name)
    }
}

/**
 *  Code in a derived class can call its superclass functions and properties directly using the super keyword:
 */
class GrandChild: Child()
{
    init
    {
        println("I am in Grand Child Class")
    }

    override fun displayName()
    {
        super.displayName()
        println("I am in " + super.name)
    }
}

/**
 * If a child class inherits multiple implementations of the same member from its immediate superclasses, then it must
 * override this member and provide its own implementation. This is different from a child class which inherits members
 * from a single parent, in such case it is not mandatory for the child class to provide the implementation of all the
 * open members.
 */
open class Rectangle
{
    open fun draw()
    {
        println("Rectangle draw...")
    }
}

interface Polygon
{
    // Interface members are open by default
    fun draw()
    {
        println("Polygon draw...")
    }
}

/**
 *  Its fine to inherit from both Rectangle and Polygon, but both of them have their own implementations of draw(),
 *  so you need to override draw() in Square and provide a separate implementation for it to eliminate the ambiguity.
 */
class Square(): Rectangle(), Polygon
{
    // The compiler requires draw() to be overridden:
    override fun draw()
    {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}

/**
 *
 */
fun inheritanceFunc()
{
    println("inheritanceFunc started.")
    println()

    var bcd = BCD()
    bcd.think()
    bcd.foo()

    // You can also override a val property with a var property, but not vice versa. This is allowed because a val
    // property essentially declares a get method, and overriding it as a var additionally declares a set method
    // in the derived class.
    println("Count BCD - ${bcd.displayCount()}")

    var efg1 = EFG(200)
    var efg2 = EFG()
    println("Count EFG - ${efg1.displayCount()}")
    println("Count EFG - ${efg2.displayCount()}")

    var gchild = GrandChild()

    var square = Square()
    square.draw()

    println()
    println("inheritanceFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}