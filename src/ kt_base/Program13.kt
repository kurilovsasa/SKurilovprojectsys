package kt_base

import java.util.*

object Program13 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число для обратного отсчёта:")
        val startCount = scanner.nextInt()

        if (startCount >= 0) {
            for (i in startCount downTo 0) {
                println(i)
            }
        } else {
            println("Некорректное значение.")
        }
    }
}