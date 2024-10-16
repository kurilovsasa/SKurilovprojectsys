package kt_base

import java.util.*

object Program12 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число n:")
        val n = scanner.nextInt()

        for (i in 1 until n) {
            println(i * 2)
        }
    }
}