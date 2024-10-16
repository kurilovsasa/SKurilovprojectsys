package kt_base

import java.util.*

object Program7 {
    fun main(args: Array<String>) {
        var str: String? = null
        // Строка устанавливается для примера
        val scanner = Scanner(System.`in`)
        println("Введите строку (или ничего для null):")
        str = scanner.nextLine()

        if (str != null) {
            println("Длина строки: " + str.length)
        } else {
            println("Строка равна null.")
        }
    }
}