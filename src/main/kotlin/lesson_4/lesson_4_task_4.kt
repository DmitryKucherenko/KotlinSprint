package lesson_4


fun main() {
    var dayOfTrain = 5
    var exerciseForArms = dayOfTrain % 2 != 0
    var exerciseForLags = dayOfTrain % 2 == 0
    var exerciseForBack = dayOfTrain % 2 == 0
    var exerciseForPress = dayOfTrain % 2 != 0

    println(
        """
           Упражнения для рук:    ${exerciseForArms}
           Упражнения для ног:    ${exerciseForLags}
           Упражнения для спины:  ${exerciseForBack}
           Упражнения для пресса: ${exerciseForPress}
        """.trimIndent()
    )

}