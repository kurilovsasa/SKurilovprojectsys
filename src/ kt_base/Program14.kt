package kt_base

import java.util.*

object Program14 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите число:")
        val targetNumber = scanner.nextInt()
        println("Введите количество элементов массива:")
        val size = scanner.nextInt()

        val numbers = IntArray(size)
        println("Введите элементы массива:")
        for (i in 0 until size) {
            numbers[i] = scanner.nextInt()
        }

        var contains = false
        for (num in numbers) {
            if (num == targetNumber) {
                contains = true
                break
            }
        }
        println(contains)
    }
}