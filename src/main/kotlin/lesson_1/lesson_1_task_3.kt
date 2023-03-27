package lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Year of launch: $year")
    println("hour of launch: ${hour.toTimeString()}")
    println("minute of launch: ${minute.toTimeString()}")

    hour = 10
    minute = 55

    println("Boarding time:  ${hour.toTimeString()} : ${minute.toTimeString()}")
}

fun Int.toTimeString() = String.format("%02d", this)