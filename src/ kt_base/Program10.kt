package kt_base

import java.util.*

object Program10 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите возраст:")
        val age = scanner.nextInt()

        if (age < 0) {
            println("Некорректный возраст.")
        } else if (age <= 12) {
            println("Ребёнок.")
        } else if (age <= 17) {
            println("Подросток.")
        } else if (age <= 64) {
            println("Взрослый.")
        } else {
            println("Пожилой.")
        }
    }
}