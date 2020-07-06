import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    var i = 0
    var k = 0
    while (i < n) {
        i++
        var j = 0
        while (j < i && k < n) {
            print("$i ")
            j++
            k++
        }
    }
}