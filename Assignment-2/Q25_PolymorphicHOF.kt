import kotlin.math.PI

abstract class Shape {
    abstract fun calculateArea(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun calculateArea(): Double {
        return side * side
    }
}

fun processShapes(shapes: List<Shape>, action: (Double) -> Unit) {
    for (shape in shapes) {
        action(shape.calculateArea())
    }
}

fun main() {
    val shapes = listOf(Circle(5.0), Square(4.0), Circle(3.0))
    processShapes(shapes) { area -> println("Area: $area") }
}
