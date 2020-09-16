
fun main() {
    run {
        println("Da goi sau khi run xong")
    }
}

fun run(a:() -> Unit) {
    println("this is run")
    a.invoke()

}