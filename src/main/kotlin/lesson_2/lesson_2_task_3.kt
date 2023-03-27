package lesson_2

fun main(){
    val departureHour = 9
    val departureMinute = 39
    val minuteOnTravel = 457

    val arrivalHour = departureHour + (departureMinute+minuteOnTravel)/60
    val arrivalMinute = (departureMinute + minuteOnTravel)%60

    println(String.format("Train arrive at %02d : %02d",arrivalHour,arrivalMinute))
}
