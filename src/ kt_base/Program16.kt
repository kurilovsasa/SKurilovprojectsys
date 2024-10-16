package kt_base

import java.util.*

object Program16 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите длину списка:")
        val n = scanner.nextInt()
        scanner.nextLine() // Очистка буфера

        val uniqueElements = LinkedHashSet<String>()
        println("Введите элементы списка:")
        for (i in 0 until n) {
            uniqueElements.add(scanner.nextLine())
        }

        println("Уникальные элементы:")
        for (elem in uniqueElements) {
            println(elem)
        }
    }
}