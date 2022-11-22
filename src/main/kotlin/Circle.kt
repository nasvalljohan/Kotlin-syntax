import kotlin.random.Random

class Circle (private val radius: Double) : Shape("Circle"){

        //Call function without making a new instance of circle.
        companion object {
            fun randomCircle(): Circle {
                val radius = Random.nextDouble(1.0, 10.0)
                return Circle(radius)
            }
        }

        init {
            if (radius < 0){
                throw Errors.NegativeNumberException()
            }
            println("$name created with radius = $radius")
            println("$name area is ${area()}")
            println("$name perimeter is ${perimeter()}")
        }



        override fun area() = radius * radius * ImportantNumbers.pi
        override fun perimeter() = 2* radius * ImportantNumbers.pi
}

