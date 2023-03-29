package lesson_4

fun main() {
    val sunnyWeather = false
    val isAwningOpen = true
    val humidity = 20
    val isWinter = false

    println("Благоприятные ли условия сейчас для роста бобовых?${sunnyWeather == true && isAwningOpen == true && humidity == 20 && isWinter == false}")

}