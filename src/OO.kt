class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

class Constructors {
    init {
        println("Init block")
    }

    constructor(i: Int) {
        println("Constructor")
    }
}

// Overriding methods
/*open class Base {
    open fun v() {}
    fun nv() {}
}

class Derived() : Base() {
    override fun v() {}
}*/

// Calling the superclass implementation
open class Foo {
    open fun f() { println("Foo.f()") }
    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override  val x: Int get() = super.x + 1

    inner class Baz {
        fun g() {
            super@Bar.f()           // Calls Foo's implementation of f()
            println(super@Bar.x)    // Uses Foo's implementation of x's getter
        }
    }
}

// Overriding Rules
open class A {
    open fun f() {print("A")}
    fun a() {print("a")}
}
interface B {
    fun f() {print("B")}  // interface members are 'open' by default
    fun b() {print("b")}
}
/*class C() : A(), B {
    override fun f() {
        super<A>.f()
        super<B>.f()
    }
}*/

// Abstract Classes
open class Base {
    open fun f() {}
}
abstract class Derived: Base() {
    override abstract fun f()  // can override a non-abstract open member with an abstract one
}

open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

fun main(args: Array<String>) {
//    InitOrderDemo("hello")
//    Constructors(1)
    printFoo(D())
}