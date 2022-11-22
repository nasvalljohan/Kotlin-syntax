import java.lang.Exception

object Errors {
    class DivisionByZeroException: Exception("you cannot divide by zero, please choose a different number")
    class NegativeNumberException: Exception("Negative numbers wont work here, please choose a positive number")
}