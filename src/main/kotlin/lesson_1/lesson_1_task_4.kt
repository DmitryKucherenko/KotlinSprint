package lesson_1

fun main(){

    val seconds:Int = 6_480
    val minutes:Int = seconds/60

    println("The time spend in space by Gagarin: $minutes : ${String.format("%02d",seconds - minutes*60)}")
}