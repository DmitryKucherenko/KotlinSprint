package lesson_2

fun main(){
    val employeesCount = 50
    val employeeSalary = 30_000
    val internCount = 30
    val internSalary = 20_000
    val permanentEmployeesCost = employeesCount * employeeSalary
    val commonCost = permanentEmployeesCost + internCount*internSalary
    val averageSalary = commonCost/(employeesCount+internCount)

    println("Permanent employees cost:$permanentEmployeesCost")
    println("Common cost:$commonCost")
    println("Average salary:$averageSalary")

}