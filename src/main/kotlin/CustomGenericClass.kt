class CustomGenericClass<A: Any, B: Any, C: Any>(
    var first: A,
    var second: B,
    var third: C,
) {
    fun printTypes(){
        println("Type of first is: ${first::class}")
        println("Type of second is: ${second::class}")
        println("Type of third is: ${third::class}")
    }

}