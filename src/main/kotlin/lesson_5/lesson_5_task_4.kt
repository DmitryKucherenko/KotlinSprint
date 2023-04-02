package lesson_5

fun main() {
    println("Enter login:")
    if (readln() == registeredLogin) {
        println("Enter password:")
        if (readln() == registeredPassword) {
            println("Welcome!")
        } else {
            println("Error authorization!Check your password!")
        }
    } else {
        println("You need registration!")
    }
}

const val registeredLogin = "Batman"
const val registeredPassword = "password"