package com.qfi

/**
 * Using extensions, we can add or remove some method functionality even without inheriting or modifying them. Extensions
 * are resolved statically, it does not actually modify the existing class, but it creates a callable function that can
 * be called with a dot operation.
 *
 * In Function Extension, Kotlin allows to define a method outside of the main class. In the following example we will see
 * how the extension is implemented at the functional level.
 */
class Alien
{
    var skills: String = "null"

    fun printMySkills()
    {
        println(skills)
    }
}

/**
 * Functional Extension
 * We implement addMySkill outside of Alien, showing ability to "extend" class functionality
 */
fun Alien.addMySkills(a: Alien): String
{
    var a4 = Alien()
    a4.skills = this.skills + " " + a.skills
    return a4.skills
}

/**
 * Object Extension
 * Kotlin provides another mechanism to implement static functionality of Java. This can be achieved using the keyword
 * "companion object". Using this mechanism, we can create an object of a class inside a factory method and later we
 * can just call that method using the reference of the class name. In the following example, we will create a companion
 * object.
 *
 * The example may seem like static in Java, however in real-time we are creating an object as a member variable of
 * that same class. This is why it is also included under extension property and can be alternatively called as an
 * object extension. You are basically extending the object of the same class to use some of the member functions.
 */
class Z
{
    companion object
    {
        fun show(): String
        {
            return "You are learning Kotlin!"
        }
    }
}

/**
 *
 */
fun extensionFunc()
{
    println("extensionFunc started.")
    println()

    var a1 = Alien()
    a1.skills = "JAVA"
    print("Alien 1 skills: ")
    a1.printMySkills()

    var a2 = Alien()
    a2.skills = "SQL"
    print("Alien 2 skills: ")
    a2.printMySkills()

    var a3 = Alien()
    a3.skills = a1.addMySkills(a2)

    print("Alien 3 skills: ")
    a3.printMySkills()

    println("Hey! ${Z.show()}")

    println()
    println("extensionFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}