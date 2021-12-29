package com.qfi

/**
 * A Kotlin constructor is a special member function in a class that is invoked when an object is instantiated. Whenever
 * an object is created, the defined constructor is called automatically which is used to initalize the properties of
 * the class.
 *
 * Every Kotlin class needs to have a constructor and if we do not define it, then the compiler generates a default
 * constructor.
 *
 * A Kotlin class can have the following two types of constructors:
 *      Primary Constructor
 *      Second Constructors
 *
 * A Kotlin class can have a primary constructor and one or more additional secondary constructors. The Kotlin primary
 * constructor initializes the class, whereas the secondary constructor helps to include some extra logic while initalizing
 * the class.
 */

/**
 * The primary constructor can be declared at the class header level as shown:
 */
class Person constructor(private val firstName: String, private val age: Int)
{
    // The constructor keyword ca nbe committed if there is no annotations or access modifiers specified
    // In this example we have declared properties through the val keyword to make them read-onlu. These properties
    // could be defined using the keyword var if you need to change their values at later point in time.

    public fun getAge(): Int
    {
        return age
    }

    public fun getFirstName(): String
    {
        return firstName
    }
}

/**
 * The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks prefixed
 * with the init keyword. There could be more than one init blocks and during initialization of an instance, the
 * initializer blocks are executed in the same order as they appear in the class body, interleaved with the property
 * initializers. The following is an example with a usage of initializer blocks:
 *
 * Kotlin also allows the constructor parameters with default values also shown below:
 */
class Person1 (private val _name: String, private val _age: Int = 20)
{
    private var age: Int
    private var name: String

    // Initializer Block
    init
    {
        this.name = _name
        this.age = _age
    }

    public fun getAge(): Int
    {
        return age
    }

    public fun getName(): String
    {
        return name
    }
}

/**
 * As mentioned earlier, Kotlin allows to create one or more secondary constructors for your class. This secondary
 * constructor is created using the constructor keyword. It is required whenever you want to create more than one
 * constructor in Kotlin or whenever you want to include more logic in the primary constructor and you cannot do that
 * because the primary constructor may be called by some other class.
 */
class Person2
{
    var age: Int
    var name: String

    // Initializer block
    init
    {
        println("Person2 Initializer Block")
    }

    // Secondary constructors do not allow to use val or var with secondary constructor parameters
    constructor(_name: String, _age: Int)
    {
        this.age = _age
        this.name = _name
    }
}

// This is an example with two secondary constructors:
class Person3
{
    var age: Int
    var name: String
    var salary: Double

    // First secondary constructor
    constructor(_name: String, _age: Int)
    {
        this.age = _age
        this.name = _name
        this.salary = 0.00
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }

    // Second secondary constructor
    constructor (_name: String, _age: Int, _salary: Double)
    {
        this.age = _age
        this.name = _name
        this.salary = _salary
        println("Name = $name")
        println("Age = $age")
        println("Salary = $salary")
    }

}

fun constructorsFunc()
{
    println("constructorsFunc started.")
    println()

    var person = Person("Vincent", 24)
    println("Person name: ${person.getFirstName()}, Person age: ${person.getAge()}")

    var person1 = Person1("Vincent Nigro", 24)
    println("Person full name: ${person1.getName()}, Person age: ${person1.getAge()}")

    var person2 = Person2("Vincent Nigro", 24)

    var person3 = Person3("Vincent Nigro", 24)
    var person3_1 = Person3("Vincent Nigro", 24, 2000.00)

    println()
    println("constructorsFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}
