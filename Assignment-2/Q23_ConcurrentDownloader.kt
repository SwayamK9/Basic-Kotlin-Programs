import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun fetchUserData(): String {
    delay(1000)
    return "Alice"
}

suspend fun fetchAppConfig(): String {
    delay(2000)
    return "Dark Mode"
}

fun main() = runBlocking {
    val userData = async { fetchUserData() }
    val appConfig = async { fetchAppConfig() }
    println(userData.await())
    println(appConfig.await())
}
