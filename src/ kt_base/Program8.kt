package kt_base

import java.util.*

object Program8 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите возраст:")
        val age = scanner.nextInt()

        if (age < 0) {
            println("Введено некорректное значение")
        } else if (age >= 18) {
            println("Совершеннолетний")
        } else {
            println("Несовершеннолетний")
        }
    }
}