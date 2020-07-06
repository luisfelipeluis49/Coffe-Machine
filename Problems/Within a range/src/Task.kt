import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print(hmm(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()))
}

fun hmm(n1: Int, n2: Int, n3: Int, n4: Int, n5: Int): Boolean {
    return n5 in n1..n2 || n5 in n3..n4
}