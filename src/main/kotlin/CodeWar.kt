import java.sql.SQLOutput
import java.util.*

//arrayOf() can change value of element, cannot change size
//mutableListOf() can change value of element, can change size.
//listOf() cannot change value of element

class CodeWar {

    //Create a function that takes in a list ex 1,2,3,4,5
    //Expected output 1,5,2,4,3
    fun alternateArr(arr: List<Int>){
        var fromRight = arr.last()//= 5
        var fromLeft = arr.first()//= 1
        for (i in arr) {
            if (fromLeft <= fromRight){
                println(fromLeft++)
            }
            if (fromLeft <= fromRight){
                println(fromRight--)
            }
        }
    }

    //Input => Output
    // 35231 => [1,3,2,5,3]
    //Convert number to reversed array of digits
    fun digitize(n:Long): IntArray  {
        var result = mutableListOf<Int>()
        var numbers = n.toString()
        var splitnum = numbers.split("")
        var revnum = splitnum.reversed()

        for (element in revnum){
            if (element != ""){
                result.add(element.toInt())
            }
        }
        return result.toIntArray()
    }

    //Check base for factor
    fun checkForFactor(base: Int, factor: Int) = base % factor == 0

    //Terminal game move function
    fun move(pos: Int, roll: Int): Int {
        val moves = roll + roll
        return moves + pos
    }

    //If it is a square, return its area. If it is a rectangle, return its perimeter.
    //assuming square if l == w
    fun areaOrPerimeter(l:Int, w:Int):Int {
        var sum = 0
        if(l == w){
            sum = l*w
        }
        if (l != w){
            sum = l*2 + w*2
        }
        return sum
    }

    //Write a function that converts str to uppercase
    fun makeUpperCase(str: String)= str.uppercase()

    //X = String with spaces, noSpace removes the ..
    fun noSpace(x: String)= x.replace(" ", "")


    // Return the sum of the array values as if all were numbers.
    // Assume input will be only of Int or String type
    fun sumTheList(mixed: List<Any>): Int {
        var sum = 0
        for (i in mixed) {
            sum += i.toString().toInt()
        }
        return sum
    }

    //takes two bullets to kill a dragon
    //Check if hero will survive to fight x dragons with x bullets.
    fun heroFightingDragons(bullets: Int, dragons: Int) : Boolean {
        if (bullets >= dragons*2){
            return true
        }
        return false
    }

    //Check if passed arr contains item, then return true
    fun include(arr: IntArray, item : Int): Boolean {
        if(arr.contains(item)){
            return true
        }
        return false
    }

    //If ODD: Return the middle char of the passed string
    //if EVEN: Return the two middle chars
    fun getMiddle(word : String) : String {
        var middle = ""
        var list = listOf<String>()
        // Even, take both middle
        if (word.length % 2 == 0){
            list = word.split("")
            var i = word.length / 2
            middle = list[i]+ list[i+1]

        }
        // Odd, take only 1 middle
        if (word.length % 2 != 0){
            list = word.split("")
            var i = word.length / 2
            middle = list[i+1]
        }
        return middle
    }

    //Given string of words, find shortest
    fun findShort(s: String): Int {

        var a = s.split(" ")
        var temp: Int
        var min = 100
        for (i in a){
            temp = i.length
            if(min > temp){
                min = temp
            }
        }
        return min
    }
    //Alternative solution BP:
    fun findShortAlt(s: String): Int = s.split(" ").minOf{it.length}











}


