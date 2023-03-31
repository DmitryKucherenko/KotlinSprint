package lesson_4

import kotlin.system.exitProcess

fun main() {
    var bodyDamage = true
    var teamCount = 0
    var provision = 0
    var goodWeather = false

    println("Does ship have damage? (y/n)")
    bodyDamage = when (readlnOrNull()) {
        YES -> true
        NO -> false
        else -> {
            println("please enter correct value 'y' or 'n'")
            exitProcess(0)
        }
    }
    println("How many person in team? ")
    readlnOrNull()?.toIntOrNull()?.let { intValue ->
            teamCount = intValue
    } ?: {
        println("please enter correct value!")
        exitProcess(0)
    }

    println("How mach provision?")
    readlnOrNull()?.toIntOrNull()?.let { intValue ->
            provision = intValue
    } ?: {
        println("please enter correct value!")
        exitProcess(0)
    }
    println("Are the weather conditions good? (y/n)")
    goodWeather = when (readlnOrNull()) {
        YES -> true
        NO -> false
        else -> {
            println("please enter correct value 'y' or 'n'")
            exitProcess(0)
        }
    }

    if ((!bodyDamage && teamCount in MIN_TEAM_COUNT until RECOMMEND_TEAM_COUNT && provision > MIN_PROVISION) ||
        (bodyDamage && goodWeather && teamCount == RECOMMEND_TEAM_COUNT)
    ) {
        println("The ship can depart!")
    } else {
        println("The ship can not depart!")
    }


}

const val MIN_TEAM_COUNT = 55
const val RECOMMEND_TEAM_COUNT = 70
const val MIN_PROVISION = 50
const val YES = "y"
const val NO = "n"