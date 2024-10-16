package kt_base

import java.util.*

object Program2 {
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите символ:")
        val ch = scanner.next()[0]
        val isLetter = Character.isLetter(ch)
        println("Является ли буквой? $isLetter")
    }
}