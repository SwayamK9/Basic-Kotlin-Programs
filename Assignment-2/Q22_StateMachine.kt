sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
    data class Error(val errorMsg: String) : ScreenState()
}

fun renderUI(state: ScreenState) {
    when (state) {
        is ScreenState.Loading -> println("Loading, please wait...")
        is ScreenState.Success -> println("Data loaded: ${state.data}")
        is ScreenState.Error -> println("Something went wrong: ${state.errorMsg}")
    }
}

fun main() {
    renderUI(ScreenState.Loading)
    renderUI(ScreenState.Success("User profile"))
    renderUI(ScreenState.Error("Network timeout"))
}
