import PhamVi.d

class Dog {
    var name:String? = null
    var age: Int = 10;

    class Nested {
        fun hello() {
            println("hello Nested")
            // Không truy cập đươc thuộc tính bên ngoài
        }
    }

    inner class Inner {
        fun hello() {
            println("hello $name, age: $age")
        }
    }
}

fun main() {
    Dog.Nested().hello()

    var dog = Dog()
    dog.name = "Ki ki"
    dog.Inner().hello()

}