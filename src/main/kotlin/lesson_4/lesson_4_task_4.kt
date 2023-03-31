package lesson_4

fun main() {
    val dayOfTrain = 5
    val isEvenDayOfTrain = dayOfTrain % 2 == 0
    val exerciseForArms = !isEvenDayOfTrain
    val exerciseForLags = isEvenDayOfTrain
    val exerciseForBack = isEvenDayOfTrain
    val exerciseForPress = !isEvenDayOfTrain

    println(
        """
           Упражнения для рук:    ${exerciseForArms}
           Упражнения для ног:    ${exerciseForLags}
           Упражнения для спины:  ${exerciseForBack}
           Упражнения для пресса: ${exerciseForPress}
        """.trimIndent()
    )
}



