package ranges

fun main() {
    for(i in 1..10) {
        println(i)
    }

    for(i in 11.rangeTo(15)) {
        println(i)
    }

    for(i in 20 downTo 16) {
        println(i)
    }

    for(i in 21..26 step 2) {
        println(i)
    }

    for(i in ('a'..'e').reversed()) {
        println(i)
    }

    for(i in 'f' until 's') {
        println(i)
    }

    println((1..20).last)
    println((1..20).last)
    println((1..20).step)
    println((1..20).min())
    println((1..20).max())
    println((1..20).distinct())
    println((1..20).average())
}