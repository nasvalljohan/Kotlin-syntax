import kotlin.math.sqrt
import kotlin.random.Random

class Triangle(
        private val a: Double,
        private val b: Double,
        private val c: Double): Shape("Triangle") {

    companion object{
        fun randomTriangle(): Triangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(1.0, 10.0)
            val c = Random.nextDouble(1.0, 10.0)
            return Triangle(a,b,c)
        }
    }

        init {
            println("$name created with sides: $a, $b, and $c")
            println("$name perimeter: ${perimeter()}")
            println("$name area: ${area()}")
        }

        override fun area() = sqrt((perimeter() / 2) * (perimeter() / 2 - a) * (perimeter() / 2 - b) * (perimeter() / 2) - c)
        override fun perimeter() = a + b + c



}