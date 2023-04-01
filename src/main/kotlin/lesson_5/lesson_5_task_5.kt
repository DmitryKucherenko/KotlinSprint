package lesson_5

import kotlin.random.Random

fun main() {
    val winNumber1 = Random.nextInt(0, 101)
    val winNumber2 = Random.nextInt(0, 101)

    var guesNumber1 = false
    var guesNumber2 = false
    println("Enter first number:")
    val inputNumber1 = readln().toInt()
    println("Enter second number:")
    val inputNumber2 = readln().toInt()

    if (inputNumber1 == winNumber1) guesNumber1 = true
    else if (inputNumber1 == winNumber2) guesNumber2 = true

    if (inputNumber2 == winNumber2) guesNumber2 = true
    else if (inputNumber2 == winNumber1) guesNumber1 = true

    when {
        guesNumber1 && guesNumber2 -> println("Поздравляем! Вы выиграли главный приз!")
        guesNumber1 && !guesNumber2 || guesNumber2 && !guesNumber1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }
    println("Wining numbers are $winNumber1 and $winNumber2")

}


