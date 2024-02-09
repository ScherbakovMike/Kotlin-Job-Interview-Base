package lambdas

val lambda1: (Double) -> Int = { x: Double -> x.toInt() }
val lambda2 = { x: Double -> x.toInt() }

val lambda3: String.()->String = { this.plus(" String lambda extension ") }

fun main() {
    println(highOrderFunction { d: Double -> d.toInt() })
    println("test".lambda3())
}

fun highOrderFunction(arg: (Double) -> Int): Int {
    return arg(5.0)
}