fun main() {
    hello()
    thamSo(1,2,3)
}

fun add(x: Int, y: Int): Int {
    return x+y
}

fun add(x: Double, y:Double): Double = x+y

fun hello(mess: String = "mac dinh") {
    println(mess)
}

fun thamSo(vararg arr:Int) {
    for (i in arr) {
        println(i)
    }
}

