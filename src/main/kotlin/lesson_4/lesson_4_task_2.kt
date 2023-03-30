package lesson_4

fun main(){
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Average для груза с весом $cargoWeight1 кг и объемом $cargoVolume1 л: ${cargoWeight1 >= MIN_AVERAGE_WEIGHT && cargoWeight1 <= MAX_AVERAGE_WEIGHT && cargoVolume1 < MAX_AVERAGE_VOLUME}")
    println("Average для груза с весом $cargoWeight2 кг и объемом $cargoVolume2 л: ${cargoWeight2 >= MIN_AVERAGE_WEIGHT && cargoWeight2 <= MAX_AVERAGE_WEIGHT && cargoVolume2 < MAX_AVERAGE_VOLUME}")
}

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100