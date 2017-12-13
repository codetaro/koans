
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

// Comments
val PI = 3.14
var x = 0
fun incrementX() {
    x += 1
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using 'x * y' yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }

    // x and y are automatically cast to non-nullable after null check
    println(x * y)
}

fun getStringLength(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

fun describe(obj: Any): String =
when (obj) {
    1           -> "One"
    "Hello"     -> "Greeting"
    is Long     -> "Long"
    !is String  -> "Not a string"
    else        -> "Unknown"
}

//fun joinToString(
//        separator: String = ", ",
//        prefix: String = "",
//        postfix: String = "",
//        /* ... */
//): String

fun printHello(name: String?) {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
}

fun double(x: Int) = x * 2

tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

private fun findFixPoint2(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return x
        x = y
    }
}

fun main(args: Array<String>) {
    /*println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")*/

    /*fun printLength(obj: Any) {
        println("'$obj' string length is ${getStringLength(obj) ?: "... err, not a string"} ")
    }
    printLength("Incomprehensibilities")
    printLength(1000)
    printLength(listOf(Any()))*/

    /*val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }*/

    /*val rectangle = Rectangle(5.0, 2.0)  //no 'new' keyword required
    val triangle = Triangle(3.0, 4.0 ,5.0)
    println("Area of rectangle is ${rectangle.calculateArea()}, its perimeter is ${rectangle.perimeter}")
    println("Area of triangle is ${rectangle.calculateArea()}, its perimeter is ${triangle.perimeter}")*/

    print(findFixPoint())
}

abstract class Shape(val sides: List<Double>) {
    val perimeter: Double get() = sides.sum()
    abstract fun calculateArea(): Double
}

interface RectangleProperties {
    val isSquare: Boolean
}

class Rectangle(
        var height: Double,
        var length: Double
) : Shape(listOf(height, length, height, length)), RectangleProperties {
    override val isSquare: Boolean get() = length == height
    override fun calculateArea(): Double = height * length
}

class Triangle(
        var sideA: Double,
        var sideB: Double,
        var sideC: Double
) : Shape(listOf(sideA, sideB, sideC)) {
    override fun calculateArea(): Double {
        val s = perimeter / 2
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC))
    }
}