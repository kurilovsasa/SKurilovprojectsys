package kt_base

import java.util.*

object Program15 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите длину массива:")
        val length = scanner.nextInt()

        val originalArray = IntArray(length)
        println("Введите элементы массива:")
        for (i in 0 until length) {
            originalArray[i] = scanner.nextInt()
        }

        val reversedArray = IntArray(length)
        for (i in 0 until length) {
            reversedArray[i] = originalArray[length - 1 - i]
        }

        println("Новый массив в обратном порядке:")
        for (num in reversedArray) {
            print("$num ")
        }
    }
}