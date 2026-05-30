sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
}

fun main() {
    val state1: ScreenState = ScreenState.Loading
    val state2: ScreenState = ScreenState.Success("Hello World")
    println(state1)
    println(state2)
}
