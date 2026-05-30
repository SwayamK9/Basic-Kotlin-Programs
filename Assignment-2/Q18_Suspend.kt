import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun fetchWeather(): String {
    delay(1000)
    return "Sunny"
}

fun main() = runBlocking {
    println(fetchWeather())
}
