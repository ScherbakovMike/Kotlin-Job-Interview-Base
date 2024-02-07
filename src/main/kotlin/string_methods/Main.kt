package string_methods

fun main() {
    val str = "12345 This is a string! 567890\n"
    println(str)
    println(str.plus(" with other string\n"))
    println(str.length)
    println(str.count())
    println(str.subSequence(0, 5))
    println(str to "in Pair")
    println(str.indexOf('5'))
    println(str.lastIndexOf('5'))
    println(str.drop(6))
    println(str.dropLast(7))
    println(str.dropWhile { c -> c != '!' })

}