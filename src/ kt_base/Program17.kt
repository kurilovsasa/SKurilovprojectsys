package kt_base

import java.util.*

object Program17 {

    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите количество элементов первого множества:")
        val n = scanner.nextInt()

        val set1: MutableSet<Int> = HashSet()
        println("Введите элементы первого множества:")
        for (i in 0 until n) {
            set1.add(scanner.nextInt())
        }

        println("Введите количество элементов второго множества:")
        val m = scanner.nextInt()

        val set2: MutableSet<Int> = HashSet()
        println("Введите элементы второго множества:")
        for (i in 0 until m) {
            set2.add(scanner.nextInt())
        }

        set1.addAll(set2)
        println("Объединение множеств: $set1")
    }
}