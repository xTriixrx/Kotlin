package com.qfi

/**
 * Access modifiers are used to restrict the usage of the variables, methods, and classes used in the application.
 * Like other OOP programming languages, this modifier is applicable at multiple places such as in the class header
 * or method declaration. There are four access modifiers available in Kotlin.
 */

/**
 * Private
 * Classes, methods, and packages can be declared with a private modifier. Once anything is declared private, then it
 * will be accessible within its immediate scope only. For instance, a private package can be accessed within that
 * specific file. A private class or interface can be accessed only by its data members, etc.
 *
 * In the example below, the class privateExample, function doSomething, and the variable i can be accessible only in
 * the same Kotlin file and the methods/members can only be accessed within the class instance itself.
 */
private class PrivateExample
{
    private val i = 1
    private fun doSomething()
    {
        println("Doing something privately...")
    }
}

/**
 * Protected
 *
 * Protected is another access modifier for Kotlin, which is currently not available for top level declaration like
 * any package cannot be protected. A protected class or interface is visible to its subclass only.
 */
abstract class C()
{
    protected val i = 1
}

class D(): C()
{
    fun getValue(): Int
    {
        return i
    }
}

/**
 * Internal
 * Internal is a newly added modifier introduced in Kotlin. If anything is marked as internal, then that specific field
 * will be in the internal field. An Internal package is visible only inside the module under which it is implemented. An
 * internal class interface is visible only by other class present inside the same package or the module.
 *
 * In the example, i and doSomething() are internal, hence, these two fields can be accessible only inside the package
 * under which it is declared.
 */
class InternalExample
{
    internal val i = 1
    internal fun doSomething()
    {
        println("Doing something internally...")
    }
}

/**
 * Public
 * Public modifier is accessible from anywhere in the project workspace. If no access modifier is specified, then by
 * default it will be in the public scope.
 */
class PublicExample
{
    val i = 1
    fun doSomething()
    {
        println("Doing something publicly...")
    }
}

/**
 *
 */
fun visibilityControlFunc()
{
    println("visibilityControlFunc started.")
    println()

    var privEx = PrivateExample()

    var protectedEx = D()
    println("Protected value from getter: ${protectedEx.getValue()}")

    var internalEx = InternalExample()
    internalEx.doSomething()

    var publicEx = PublicExample()
    publicEx.doSomething()

    println()
    println("visibilityControlFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}