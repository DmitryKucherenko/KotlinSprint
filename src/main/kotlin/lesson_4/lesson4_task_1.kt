package lesson_4

fun main() {
    val freeChairsToday = 0
    val freeChairsTomorrow = 4

    println(
        "Доступность столиков на сегодня: ${freeChairsToday in 1 until ALL_CHAIRS} " +
                "\nДоступность столиков на завтра: ${freeChairsTomorrow in 1 until ALL_CHAIRS}"
    )

}

const val ALL_CHAIRS = 13
