open class Vehicle {
    open fun startEngine() {
        println("Engine started")
    }
}

class Motorcycle : Vehicle() {
    override fun startEngine() {
        println("Vroom!")
    }
}

fun main() {
    val motorcycle = Motorcycle()
    motorcycle.startEngine()
}
