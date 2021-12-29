package com.qfi

/**
 * Kotlin Operators
 */
fun operatorsFunc()
{
    println("operatorsFunc started.")
    println()

    println("Arithmetic Operators: +, -, *, /, %")
    // Arithmetic Operators: +, -, *, /, %
    var x: Int = 40
    var y: Int = 20
    var bx: Boolean = true
    var by: Boolean = false

    println("x + y = " + (x + y))
    println("x - y = " + (x - y))
    println("x / y = " + (x / y))
    println("x * y = " + (x * y))
    println("x % y = " + (x % y))
    println()

    println("Relational Operators: >, <, >=, <=, ==, !=")
    // Relational Operators: >, <, >=, <=, ==, !=

    println("x > y = " + (x > y))
    println("x < y = " + (x < y))
    println("x >= y = " + (x >= y))
    println("x <= y = " + (x <= y))
    println("x == y = " + (x == y))
    println("x != y = " + (x != y))
    println()

    println("Assignment Operators: =, +=, -=, *=, /=, %=")
    // Assignment Operators: =, +=, -=, *=, /=, %=

    x += 5
    println("x += 5 = " + x)
    x = 40
    x -= 5
    println("x += 5 = " + x)
    x = 40
    x *= 5
    println("x += 5 = " + x)
    x = 40
    x /= 5
    println("x += 5 = " + x)
    x = 40
    x %= 5
    println("x += 5 = " + x)
    x = 40
    println()

    println("Unary Operators: +, -, ++, --, !")
    // Unary Operators: +, -, ++, --, !

    println("+x = " + (+x))
    x = 40
    println("-x = " + (-x))
    x = 40
    println("++x = " + (++x)) // ++ supports prefix & postfix
    x = 40
    println("--x = " + (--x)) // -- supports prefix & postfix
    println()

    println("Logical Operators: &&, ||, !")
    // Logical Operators: &&, ||, !
    println("x && y = " + (bx && by))
    println("x || y = " + (bx || by))
    println("!y = " + (!by))
    println()

    println("Kotlin Bitwise Operations: shl(bits), shr(bits), ushr(bits), and(bits), or(bits), xor(bits), inv()")
    //  Kotlin Bitwise Operations: shl(bits), shr(bits), ushr(bits), and(bits), or(bits), xor(bits), inv()
    x = 60 // 0011 1100
    y = 13 // 0000 1101

    println("x.shl(2) = " + x.shl(2)) // 240 = 1111 0000
    println("x.shr(2) = " + x.shr(2)) // 15 = 0000 1111
    println("x.and(y) = " + x.and(y)) // 12 = 0000 1100
    println("x.or(y) = " + x.or(y)) // 61 = 0011 1101
    println("x.xor(y) = " + x.xor(y)) // 49 = 0011 0001
    println("x.inv() = " + x.inv()) // -61 1100 0011

    println()
    println("operatorsFunc finished.")

    println()
    println("-".repeat(MAX_LINE_OUT))
    println()
}