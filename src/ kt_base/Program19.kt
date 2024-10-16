package kt_base

fun main() {
    val weekdays = mapOf(
        "Понедельник" to 1,
        "Вторник" to 2,
        "Среда" to 3,
        "Четверг" to 4,
        "Пятница" to 5,
        "Суббота" to 6,
        "Воскресенье" to 7
    )

    println("Словарь дней недели:")
    for ((day, number) in weekdays) {
        println("$day - $number")
    }
}