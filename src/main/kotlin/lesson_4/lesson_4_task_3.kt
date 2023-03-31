package lesson_4

fun main() {
    val sunnyWeather = true
    val awningOpen = true
    val humidity = 20
    val winter = true

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${sunnyWeather && awningOpen && humidity == OPTIMAL_HUMIDITY && !winter}"
    )

}

const val  OPTIMAL_HUMIDITY = 20