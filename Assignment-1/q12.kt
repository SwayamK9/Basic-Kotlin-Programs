fun main() {
    var a = 10
    var b = 20

    var temp = a
    a = b
    b = temp

    println("$a $b")

    var x = 5
    var y = 15

    x = x + y
    y = x - y
    x = x - y

    println("$x $y")
}