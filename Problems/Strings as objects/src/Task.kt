fun main() {
    val input = readLine()!!
    if (input.isEmpty()) return
    when {
        input.first() == 'i' -> {
            println(input.drop(1).toInt() + 1)
        }
        input.first() == 's' -> {
            println(input.drop(1).reversed())
        }
        else -> {
            println(input)
        }
    }
}