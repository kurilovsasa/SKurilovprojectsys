package kt_base

import java.util.*

object Program6 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите строку:")
        val str = scanner.nextLine()
        if (str.length > 2) {
            val newStr = str.substring(2) + str.substring(0, 2)
            println("Новая строка: $newStr")
        } else {
            println("Строка слишком короткая.")
        }
    }
}