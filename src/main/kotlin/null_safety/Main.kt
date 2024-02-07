package null_safety

fun main() {
    var str: String = "Some string"
    // str = null; // compilation error
    var nullableStr: String?
    nullableStr = null // it's ok

    println(nullableStr ?: "This message will be printed because the argument is null")
    println(nullableStr?.length ?: "Length is 0")

    str = ""
    println(str!!.length)

    println("str is String: ${str is String}")

    println("str is not a Number: ${str as? Number}")

}