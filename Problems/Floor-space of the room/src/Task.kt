import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    print(when (scanner.next()) {
        "triangle" -> triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble())
        "rectangle" -> rectangle(scanner.nextDouble(), scanner.nextDouble())
        "circle" -> circle(scanner.nextDouble())
        else -> "error!"
    })
}

fun triangle(a: Double, b: Double, c: Double): Double {
    val p = (a + b + c) / 2
    return sqrt(p * (p - a) * (p - b) * (p - c))
}

fun rectangle(a: Double, b: Double): Double {
    return a * b
}

fun circle(r: Double): Double {
    return 3.14 * r.pow(2)
}