
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

fun main(args: Array<String>) {
    /*println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")*/

    printProduct2("6", "7")
    printProduct2("a", "7")
    printProduct2("a", "b")
}
