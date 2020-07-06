import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val symbol = scanner.nextInt()
    print("Symbol # $symbol of the string \"$string\" is \'${string.substring(symbol - 1, symbol)}\'")
}