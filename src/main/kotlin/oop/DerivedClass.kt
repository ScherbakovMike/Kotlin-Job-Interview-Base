package oop

class DerivedClass private constructor() :
    OuterClass("derived outer name", " derived outer address") {

    companion object {
        fun getInstance() = DerivedClass()
    }

}

fun main() {
    val derivedClassInstance = DerivedClass.getInstance()
    println("${derivedClassInstance.outerName}: ${derivedClassInstance.outerAddress}")
}