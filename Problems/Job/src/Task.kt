import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(canWork(scanner.nextInt()))
}

fun canWork(age: Int): Boolean {
    return age in 18..59
}