import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val result = async { 5 + 5 }
    println(result.await())
}
