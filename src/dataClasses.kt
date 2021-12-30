package com.qfi

/**
 * A class can be marked as a data class whenever it is marked as "data". This type of class can be used to hold basic
 * data apart. Other than this, it does not provide any other functionality.
 *
 * All the data classes need to have is one primary constructor and all primary constructors should have at least
 * one parameter. Whenever a class is marked as data, we can use some of the inbuilt functions of that data class
 * such as toString() hashCode() etc. Any data class cannot have a modifier like abstract and open or internal. Data
 * classes can be extended to other classes too.
 */
data class Book(private val name: String, private val publisher: String, private var reviewScore: Int)
{
    fun getName(): String
    {
        return name
    }

    fun getPublisher(): String
    {
        return publisher
    }

    fun getReviewScore(): Int
    {
        return reviewScore
    }
}

/**
 *
 */
fun dataClassesFunc()
{
    println("dataClassesFunc started.")
    println()

    val book: Book = Book("Kotlin", "TutorialPoint", 5)
    println("Name of the book is: ${book.getName()}")
    println("Publisher of the book is: ${book.getPublisher()}")
    println("Review score of the book is: ${book.getReviewScore()}")
    println("Book toString: $book")
    println("Example of the hashCode function: ${book.hashCode()}")

    println()
    println("dataClassesFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}