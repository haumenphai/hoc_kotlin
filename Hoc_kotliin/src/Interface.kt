package interface2

interface Fly {
    fun fly() {
        println("fly mac dinh")
    }
    fun flyV2()
}

class Bird: Fly {
    override fun flyV2() {
        println("fly v2")
    }

   
}

fun main() {
    val bird = Bird()
    bird.fly()
    bird.flyV2()

}