package oop

abstract class AbstractClass {

    companion object AbstractCompanion {
        private const val name: String = "some name"

        fun printName() {
            println(this.name)
        }
    }
}

class Implementation: AbstractClass() {

    companion object AbstractCompanion {
        private const val name: String = "another name"

        fun printName() {
            println(this.name)
        }
    }

    fun printName() {
        println("Name in the implementation")
    }
}

fun main() {
    AbstractClass.printName()
    Implementation.printName()
    Implementation().printName()
}