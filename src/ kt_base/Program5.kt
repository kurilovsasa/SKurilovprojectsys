package kt_base

import java.util.*

object Program5 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        val result = StringBuilder()
        println("Введите 5 строк:")
        for (i in 0..4) {
            result.append(scanner.nextLine())
        }
        println("Объединённые строки: $result")
    }
}