import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()

    when {
        a < b -> {
            print(b)
        }
        a > b -> {
            print(a)
        }
        a == b -> {
            print(b)
        }
    }
}