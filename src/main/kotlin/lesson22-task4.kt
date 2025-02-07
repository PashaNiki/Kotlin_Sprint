package org.example

class MainScreenViewModel {

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false
    )

    var mainScreenState = MainScreenState(data = "")

    fun loadData() {
        println("Начальное состояние: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Состояние после начала загрузки: $mainScreenState")

        Thread.sleep(2000)

            mainScreenState = mainScreenState.copy(data = "данные с сервера", isLoading = false)
            println("Состояние после загрузки данных: $mainScreenState")
        }
    }

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}