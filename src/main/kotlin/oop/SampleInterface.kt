package oop

interface SampleInterface {
    fun action1() {
        println("Some default action")
    }

    fun action2()
}

class ClassWithActions: SampleInterface {
    override fun action2() {
        println("Action 2 has been implemented in derived class")
    }
}

fun main() {
    val classInstance = ClassWithActions()
    classInstance.action1()
    classInstance.action2()
}