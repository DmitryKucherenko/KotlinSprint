package lesson_4

fun main(){
    println("Average для груза с весом 20 кг и объемом 80 л: ${20 >= MIN_AVERAGE_WEIGHT && 20 <= MAX_AVERAGE_WEIGHT && 80 < MAX_AVERAGE_VOLUME}")
    println("Average для груза с весом 50 кг и объемом 100 л: ${50 >= MIN_AVERAGE_WEIGHT && 50 <= MAX_AVERAGE_WEIGHT && 100 < MAX_AVERAGE_VOLUME}")
}

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100