package iteration_when_expressions

fun main() {
    for (i in 1..5) {
        println(i)
    }

    val list = listOf('a', 'b', 'c', 'd', 'e')
    list.indices.forEach { index ->
        println("$index:${list[index]}")
    }

    for ((index, value) in list.withIndex()) {
        println("$index: $value")
    }

    list.forEach { println(it) }

    println(
        when (list) {
            listOf(1, 2, 3, 4, 5) -> "Numbers"
            listOf('a', 'b', 'c', 'd', 'e') -> "Characters"
            else -> "Something else"
        }
    )

    println(
        when (list) {
            is List<*> -> "List"
            else -> "Something else"
        }
    )

    outer@ for (i in 1..10) {
        inner@ for (j in 25..35) {
            println("$i: $j")
            if (i == 5) {
                break@outer
            }
        }
    }
}