

data class HocSinh(
    var name: String,
    var address: String
) {

}

fun main() {
    val hocSinh: HocSinh = HocSinh("Nguyen Van A", "Ha Noi")
    println(hocSinh.name)
    println(hocSinh.address)
    println(hocSinh.toString())
}