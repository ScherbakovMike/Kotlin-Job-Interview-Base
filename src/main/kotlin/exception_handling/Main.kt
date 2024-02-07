package exception_handling

fun main() {

    try {
        println("Before exception")
        throw Exception("Some exception")
    } catch (e: Exception) {
        println("I've caught a new exception")
    } finally {
        println("The 'finally' section will be executed no matter what")
    }

    println(
        try {
            throw Exception("I'm an exception")
        } catch (e: Exception) {
            "Try block can be a statement"
        }
    )

}