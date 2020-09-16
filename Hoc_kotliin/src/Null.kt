fun main() {
    var s:String? = null;
//    s = "dohaumen"
    if (s != null) {
        println(s)
    } else {
        println("lol")
    }

    // gọi hàm mà ko cần quan tâm null hay ko
    var kk = s!!.length
    println(kk)
}