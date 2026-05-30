class Thermostat {
    var temperature: Double = 20.0
        private set

    fun setTemp(newTemp: Double) {
        temperature = newTemp
    }
}

fun main() {
    val thermostat = Thermostat()
    thermostat.setTemp(25.0)
    println(thermostat.temperature)
}
