
package kt_base

import java.util.*

object Program4 {
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите символ в нижнем регистре:")
        val lowerChar = scanner.next()[0]
        val upperChar = lowerChar.uppercaseChar()
        println("Верхний регистр: $upperChar")
        println("Код Unicode нового символа: " + upperChar.code)
    }
}