package lesson_2

fun main(){
    val markOfPerson1 = 3
    val markOfPerson2 = 4
    val markOfPerson3 = 3
    val markOfPerson4 = 5

    val averageMark = (markOfPerson1 + markOfPerson2 + markOfPerson3 + markOfPerson4)/4.0

    println(String.format("Average mark of English class is %.2f",averageMark))
}