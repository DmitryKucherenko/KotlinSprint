package lesson_5

fun main() {
    println("Please, enter you birthday:")
    val yearOfBirthday = readln().toInt()
    val userAge = CURRENT_YEAR - yearOfBirthday

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран с ограниченным контентом")
    else println("Вернуться на главный экран")
}

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023