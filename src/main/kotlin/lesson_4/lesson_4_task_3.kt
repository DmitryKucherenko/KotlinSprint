package lesson_4

fun main() {
    val sunnyWeather = true
    val isAwningOpen = true
    val humidity = 20
    val isNotWinter = false

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${sunnyWeather == true && isAwningOpen == true && humidity == 20 && isNotWinter == true}"
    )

}