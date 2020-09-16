fun main() {
    println(sum(1,2))
    println(sum2(3,1))
    println(sum3(1,2))

    var map = mutableMapOf<String, Any?>("1" to 123, "2" to "lol")
}

// Đây là những anonymous funtion (hàm không tên), và biểu thức lamda
var sum = {x: Int, y:Int -> x+y}
var sum2: (Int, Int) -> Int = { x, y -> x+y}
var sum3 = fun(x: Int, y:Int): Long {
    return (x+y).toLong();
}