fun main() {
    var x = "dohaumen";
    for (char in x) {
        print(" $char")
    }
    println();println("-------------------")

    val ss = """
        dohaumen
        vipvip
        akvndlvndv wkek 
        ---
    """.trimIndent()
    println(ss)

    println(x.removeRange(1,3))
}