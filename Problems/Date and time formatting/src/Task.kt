import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val h = scanner.nextInt()
    val min = scanner.nextInt()
    val s = scanner.nextInt()
    val day = scanner.nextInt()
    val month = scanner.nextInt()
    val year = scanner.nextInt()

    print("$h:$min:$s $day/$month/$year")
}