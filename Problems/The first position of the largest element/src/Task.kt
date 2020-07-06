import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var bigNum = 0
    var i = 0
    var bigI = 0
    while (scanner.hasNext()) {
        i++
        val num = scanner.nextInt()
        if (i == 1) {
            bigNum = num
            bigI = i
        }
        if (num > bigNum) {
            bigNum = num
            bigI = i
        }
    }
    println("$bigNum $bigI")
}