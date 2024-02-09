package oop

open class OuterClass(
    var outerName: String,
    var outerAddress: String,
    _property: String
) {
    object NewObject {
        var objectProperty: String = "nested object property"

        init {
            println("I was inited")
        }
    }

    constructor(
        outerName: String,
        outerAddress: String
    ) : this(outerName, outerAddress, "456")

    private var outerField = "Outer Field Value"

    init {
        outerField = _property
    }

    var field: String = ""
        get() = field.plus(" appendix")
        set(value) {
            field = value.uppercase()
        }

    inner class InnerClass(
        var innerName: String,
        var innerAddress: String
    ) {
        var innerField = "Inner Field Value"
    }

    class NestedClass(
        var nestedName: String,
        var nestedAddress: String
    ) {
        var nestedField = "Nested Field Value"
    }
}

fun main() {
    val outerClassInstance = OuterClass("outer name", "outer address")
    println("${outerClassInstance.outerName}: ${outerClassInstance.outerAddress}")

    val innerClassInstance = outerClassInstance.InnerClass("inner name", "inner address")
    println("${innerClassInstance.innerName}: ${innerClassInstance.innerAddress}")

    val nestedClassInstance = OuterClass.NestedClass("nested name", "nested address")
    println("${nestedClassInstance.nestedName}: ${nestedClassInstance.nestedAddress}")

    outerClassInstance.field = "test field value"
    println(outerClassInstance.field)

    println(OuterClass.NewObject.objectProperty)
}