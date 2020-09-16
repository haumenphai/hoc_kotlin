fun main() {
    val a1 = 5;
    val a2 = 4;
    val x = if (a1 > a2) "555" else "444"
    println(x)

    // When
    val string1 = "ddd"
    val zz = when(string1) {
        "sss" -> "dohaumen"
        "111" -> "vip"
        else -> "hello"
    }
    println(zz)

    val moth = 12;
    when(moth) {
        1-> {
            println("Thang 1")
        }
        12-> {
            println("Thang 12")
        }
        else -> {
            println("Ko co thang")
        }
    }
    println("----------------------------");

    // Vong Lap
    val arr = listOf<Int>(1,2,3,4,5)
    var mutiList = mutableListOf<String>("String 1", "String 2", "String 3")
    mutiList.add("Dohaumen")

    for (i in 10 downTo 1) {
        println(i)
    }

    for (i in 0..100 step 2) {
        println(i)
    }

    for (v in mutiList) {
        println(v)
    }

    for (i in mutiList.indices) {
        println("i:$i = ${mutiList.get(i)}")
    }

    for ((i,v) in mutiList.withIndex()) {
        println("$i, $v")
    }

     vong_lap_i@
     for (i in 0..mutiList.size) {
        jj@
        for (j in 1..5) {
            if (j == 2) {
                break@vong_lap_i;
            }
        }
    }
}