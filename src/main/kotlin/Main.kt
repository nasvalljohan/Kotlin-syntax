
fun main() {

    var cw = CodeWar()
    val circle2 = Circle(3.0)
    val triangle2 = Triangle(11.0, 2.0, 5.0)
    val rectangle2 = Rectangle(10.0)
    var cgc = CustomGenericClass<Any, Any, Any>("tjena", 30, 20)
    var shapes = listOf(circle2, triangle2, rectangle2)

    shapes = shapes.customFilter {
        it.area() > 0.0
    }
    for (shape in shapes) {
        println(shape.area())

    }






}


//Custom extension filter-functions:
fun <T> List<T>.customFilter(filterFunction: (T) -> (Boolean)): List<T> {
    val resultList = mutableListOf<T>()

    for (item in this){ // For shape in this(=List<Shape>)
        if (filterFunction(item)){ // IF filterfunction returns true
            resultList.add(item)
        }
    }
    return resultList
}


fun  List<Int>.customSum(filterFunc: (Int) -> (Boolean)): Int{
    var sum = 0
    for (item in this){
        if (filterFunc(item)){
            sum += item
        }
    }
    return sum
}



