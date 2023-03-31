package lesson_5

fun main() {
    var number1: Int? = null
    var number2: Int? = null
    var sumOfNumbers: Int? = null

    while (number1 == null) {
        println("Please, input first value:")
        number1 = readlnOrNull()?.toIntOrNull()
    }

    while (number2 == null) {
        println("Please, input second value:")
        number2 = readlnOrNull()?.toIntOrNull()
    }
    while (sumOfNumbers == null) {
        println("Please enter sum: $number1 + $number2 =")
        sumOfNumbers = readlnOrNull()?.toIntOrNull()
    }

    if(sumOfNumbers == number1 + number2) println("Добро пожаовать!") else println("Доступ запрещен.")


}