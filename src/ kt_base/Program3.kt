package kt_base

import java.util.*

object Program3 {
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите два символа:")
        val ch1 = scanner.next()[0]
        val ch2 = scanner.next()[0]
        val unicodeDifference = ch1.code - ch2.code
        println("Разность Unicode: $unicodeDifference")
    }
}