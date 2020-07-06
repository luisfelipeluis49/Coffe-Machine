import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var bigNum = 0

    repeat(n) {
        val num = scanner.nextInt()
        if (num % 4 == 0 && num > bigNum) {
            bigNum = num
        }
    }

    println(bigNum)
}