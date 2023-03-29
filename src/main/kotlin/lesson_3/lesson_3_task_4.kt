package lesson_3

fun main() {
    var moveFrom = "E2"
    var moveTo = "E4"
    var move = 1

    var chessMoveState = "$moveFrom-$moveTo;$move"
    println(chessMoveState)

    moveFrom = "D2"
    moveTo = "D3"
    move++

    chessMoveState = "$moveFrom-$moveTo;$move"
    println(chessMoveState)
}