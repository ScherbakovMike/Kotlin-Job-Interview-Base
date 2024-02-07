package data_types_and_conversion

fun main(args: Array<String>) {
    val list = mutableListOf<Any>()

    val x: Int = 1000
    val y: Double = 110.00
    val f: Float = 110.00f
    val a: Long = 1100000004
    val b: Short = 100
    val c: Byte = 1
    val ch: Char = 'c'
    val escapedString = "\t escaped string example \t with tabs"
    val rowString = """
        This is
        a multiline 
        text.
    """.trimIndent()
    val booleanValue = false.and(true).or(false)
    val intArray = intArrayOf(1, 2, 3)

    list.add(x)
    list.add(y)
    list.add(f)
    list.add(a)
    list.add(b)
    list.add(c)
    list.add(ch)
    list.add(escapedString)
    list.add(escapedString[5])
    list.add(rowString)
    list.add(booleanValue)
    list.add(intArray)

    list.forEach { item ->
        if (item is IntArray) {
            println(item.contentToString())
        } else {
            println("${item.javaClass.kotlin}: $item")
        }
    }
}
