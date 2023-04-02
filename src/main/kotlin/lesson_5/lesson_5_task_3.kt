package lesson_5

fun main() {
    var guesNumber1 = false
    var guesNumber2 = false
    println("Enter first number:")
    val inputNumber1 = readln().toInt()
    println("Enter second number:")
    val inputNumber2 = readln().toInt()

    if (inputNumber1 == WIN_NUMBER_1) guesNumber1 = true
    else if (inputNumber1 == WIN_NUMBER_2) guesNumber2 = true

    if (inputNumber2 == WIN_NUMBER_2) guesNumber2 = true
    else if (inputNumber2 == WIN_NUMBER_1) guesNumber1 = true

    when {
        guesNumber1 && guesNumber2 -> println("Поздравляем! Вы выиграли главный приз!")
        guesNumber1 && !guesNumber2 || guesNumber2 && !guesNumber1 -> println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }
    println("The numbers $WIN_NUMBER_1 and $WIN_NUMBER_2 WINS!")

}


const val WIN_NUMBER_1 = 100
const val WIN_NUMBER_2 = 10
