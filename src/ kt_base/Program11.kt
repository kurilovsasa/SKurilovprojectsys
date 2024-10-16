package kt_base

import java.util.*

object Program11 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число от 1 до 7:")
        val day = scanner.nextInt()

        when (day) {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Некорректный ввод.")
        }
    }
}