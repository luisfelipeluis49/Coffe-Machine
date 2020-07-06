import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println(isRainbow(input.next()))
}

enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");
}

fun isRainbow(color: String): Boolean {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return true
    }
    return false
}