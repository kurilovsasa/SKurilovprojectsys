package kt_base

import java.util.*

object Program9 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val number = scanner.nextInt()

        if (number % 2 == 0) {
            println("Число четное.")
        } else {
            println("Число нечетное.")
        }
    }
}