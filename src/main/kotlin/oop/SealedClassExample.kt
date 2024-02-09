package oop

import kotlin.random.Random

fun interface Displayable {
    fun display()
}

sealed class SealedClassExample : Displayable {
    data object Example1 : SealedClassExample() {
        override fun display() {
            println("I'm displaying an Example 1 class")
        }
    }

    data object Example2 : SealedClassExample() {
        override fun display() {
            println("I'm displaying an Example 2 class")
        }
    }
}

fun main() {
    val example1: SealedClassExample = SealedClassExample.Example1
    val example2: SealedClassExample = SealedClassExample.Example2

    val instance = if (Random.nextBoolean()) example1 else example2
    when(instance) {
        is SealedClassExample.Example1 -> println("Example 1")
        is SealedClassExample.Example2 -> println("Example 2")
    }
}