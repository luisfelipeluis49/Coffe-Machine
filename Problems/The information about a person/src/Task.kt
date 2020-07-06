fun main(args: Array<String>) {
    val input: List<String>? = readLine()?.split(" ")
    print("${input?.get(0)?.substring(0, 1)}. ${input?.get(1)}, ${input?.get(2)} years old")
}