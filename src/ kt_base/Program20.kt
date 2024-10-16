package kt_base

fun main() {
    println("Введите элементы списка через запятую:")
    val input = readLine() ?: ""
    val items = input.split(",").map { it.trim() }

    val elementCounts = items.groupingBy { it }.eachCount()

    println("Результат:")
    for ((element, count) in elementCounts) {
        println("$element - $count раз(а)")
    }
}