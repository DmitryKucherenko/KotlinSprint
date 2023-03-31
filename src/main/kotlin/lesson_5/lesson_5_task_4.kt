package lesson_5

fun main() {
    println("Enter login:")
    val login = readln()

    if (login == registeredLogin) {
        println("Enter password:")
        val password = readln()
        if (password == registeredPassword) {
            println("Welcome!")
        } else {
            println("Error authorization! Check you password!")
        }
    }else{
        println("You need registration!")
    }


}

const val registeredLogin = "Batman"
const val registeredPassword = "password"