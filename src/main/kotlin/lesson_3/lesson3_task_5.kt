package lesson_3
fun main() {
    val chessMoveState = "D2-D4;0"
    val arrMoveState = chessMoveState.split("-", ";")
    val moveFrom = arrMoveState[0]
    val moveTo = arrMoveState[1]
    val move = arrMoveState[2].toInt()

    println(moveFrom)
    println(moveTo)
    println(move)
}