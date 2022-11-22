
    open class Person(
        var gender: String,
        var age: Int,
        var name: String
    ) {
        init {
            println("i am the superclass for person")
        }
    }

class Player(gender: String, age: Int, name: String
):
    Person(gender, age,name) {

    fun whoIsThis() {
        println("Hello my name is $name, i am $age years old and im a $gender")
    }
}
    // _________________________________________________________

    open class Car (
        var horsePower: Int,
        var driveTrain: String,
        var color: String) {

        init {
            println("Superclass of car")
        }

    }

    class Volvo(
        horsePower: Int,
        driveTrain: String,
        color: String)
        : Car(horsePower,
            driveTrain,
            color){

        fun generateCar(){
            println("this is a volvo with $horsePower hp and its $driveTrain, the color is $color")
        }
    }