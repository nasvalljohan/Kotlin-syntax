
abstract class Shape(
    var name: String
    ) {

    constructor(name: String, vararg dimensions: Double) : this(name)

    init {
        println("I am the super class!")
    }

    //When we don't know the implementation
    //But we know the subclasses is going to need it
    //Every abstract function needs to be implemented in subclasses
    //That's why we don't make abstract fun for isSquare, a circle cannot be square etc.
    abstract fun area(): Double
    abstract fun perimeter(): Double

    //When we know the implementation
    fun changeName(newName: String){
        name = newName
    }
}

//Anonym klass för trapets, sida a, b, c, d och höjd, kolla så de är en rektangel eller inte
//Skapa en companion object för rectangle och triangel som skapar random-rekt/triang