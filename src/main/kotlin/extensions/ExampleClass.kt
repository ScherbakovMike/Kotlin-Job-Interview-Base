package extensions

class ExampleClass {

    companion object {
        fun staticMethod() {
            println("ExampleClass.staticMethod()")
        }
    }

    fun classMethod() {
        println("ExampleClass.classMethod")
    }
}

fun ExampleClass.newClassMethod() {
    println("Extended ExampleClass.classMethod")
}

fun ExampleClass.Companion.newStaticMethod() {
    println("Extended ExampleClass.staticMethod()")
}

fun main() {
    val instance = ExampleClass()
    instance.newClassMethod()
    ExampleClass.newStaticMethod()
}
