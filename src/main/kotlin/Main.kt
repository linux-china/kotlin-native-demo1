import hello.*
import libmath2.sum2

fun main(args: Array<String>) {
    println(hello("Jackie"))
    println(sum2(1, 2))
}

fun welcome(name: String): String {
    return "welcome $name"
}