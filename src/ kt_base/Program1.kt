package kt_base;

import java.sql.DriverManager.println
import java.util.*


object Program1 {
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Введите три числа с плавающей точкой:")
        val num1 = scanner.nextDouble()
        val num2 = scanner.nextDouble()
        val num3 = scanner.nextDouble()
        val average = (num1 + num2 + num3) / 3
        println("Среднее арифметическое: $average")
    }
}