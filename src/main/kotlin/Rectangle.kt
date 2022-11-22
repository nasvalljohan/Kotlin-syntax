import kotlin.random.Random

//RECTANGLE

class Rectangle (
    private val a: Double,
    private val b: Double) : Shape("Rectangle"){

    constructor(a: Double) : this(a, a)
    constructor(a: Int, b: Int) : this(a.toDouble(), b.toDouble())

    companion object{
        fun randomRectangle(): Rectangle {
            val a = Random.nextDouble(1.0, 10.0)
            val b = Random.nextDouble(1.0, 10.0)
            return Rectangle(a, b)
        }
    }

    init {
        println("$name created with a = $a and b = $b")
        println("$name area is ${area()}")
        println("Is it a square? ${isSquare()}")
        println("The perimeter? ${perimeter()}")
    }

    override fun area() = a * b
    override fun perimeter() = 2 * a + 2 * b
    private fun isSquare() = a == b
}







