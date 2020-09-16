


open class Cat(var name: String, val age: Int, color: String?) {
    init {
        println("Doi tuong duoc khoi tao")
    }

    open fun talk() {
        println("$name hello")
    }
}

class CatV2(var soThich: String, name: String, age: Int, color: String?): Cat(name, age, color) {
    private var soChan: Int? = null
      

    override fun talk() {
        super.talk()
        println("Override fun")
    }
}

fun main() {
    val cat: Cat = Cat("Meow", 2, null)
    val cat2 = Cat(name = "Kit Kit", age = 5, color = null)

    println(cat.name)
    println(cat.age)
    cat2.talk()

    val catV2 = CatV2(soThich = "an ca", name = "Cat V2", age = 12, color = "black")
    println(catV2.soThich)
    catV2.talk()

}