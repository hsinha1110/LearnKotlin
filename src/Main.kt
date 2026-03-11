class Car(
    var name: String,
    var model: String,
    var color: String,
    var engine: String
) {

    fun horn() {
        println("$model Beep Beep")
    }
}

fun main() {

    val c1 = Car(
        "Volvo",
        "Fiat",
        "Blue",
        "Four Stroke"
    )

    c1.horn()
}