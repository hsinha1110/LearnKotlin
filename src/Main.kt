class Car {
    // secondary constructor
    var model: String
    var year: Int

    constructor(model: String, year: Int) {
        this.model = model
        this.year = year
    }

    fun horn() {
        println("${model} ${year} Horn is Beep Beep Beep")
    }
}

fun main() {
    var car = Car("BMW", 2026)
    car.horn()
}