package lesson_2

import kotlin.math.pow

fun main() {
    val initSum = 70_000
    val interestRate = 16.7
    val yearCount = 20
    val countCalcIntRate = 1

    val finalSumDeposit = initSum * (1 + interestRate / 100.0).pow(yearCount / countCalcIntRate)

    println(String.format("Yor deposit will be %.3f after %d years", finalSumDeposit, yearCount))

}