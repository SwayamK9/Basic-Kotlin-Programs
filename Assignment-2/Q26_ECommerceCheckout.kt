import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

data class CartItem(val name: String, val price: Double, val quantity: Int)

fun List<CartItem>.calculateTotal(): Double {
    return this.sumOf { it.price * it.quantity }
}

sealed class CheckoutResult {
    object Processing : CheckoutResult()
    data class Success(val receiptId: String) : CheckoutResult()
    data class Failed(val reason: String) : CheckoutResult()
}

object PaymentProcessor {
    suspend fun processPayment(cart: List<CartItem>): CheckoutResult {
        delay(2000)
        val total = cart.calculateTotal()
        return if (total > 1000) {
            CheckoutResult.Failed("Insufficient funds for large transaction")
        } else {
            CheckoutResult.Success("TXN-${(1000..9999).random()}")
        }
    }
}

fun main() = runBlocking {
    val cheapCart = listOf(
        CartItem("Mouse", 25.0, 1),
        CartItem("USB Cable", 10.0, 2)
    )

    val expensiveCart = listOf(
        CartItem("Laptop", 800.0, 1),
        CartItem("Monitor", 400.0, 1)
    )

    launch {
        val result = PaymentProcessor.processPayment(cheapCart)
        when (result) {
            is CheckoutResult.Processing -> println("Cheap cart: Still processing...")
            is CheckoutResult.Success -> println("Cheap cart: Payment successful! Receipt: ${result.receiptId}")
            is CheckoutResult.Failed -> println("Cheap cart: Payment failed! Reason: ${result.reason}")
        }
    }

    launch {
        val result = PaymentProcessor.processPayment(expensiveCart)
        when (result) {
            is CheckoutResult.Processing -> println("Expensive cart: Still processing...")
            is CheckoutResult.Success -> println("Expensive cart: Payment successful! Receipt: ${result.receiptId}")
            is CheckoutResult.Failed -> println("Expensive cart: Payment failed! Reason: ${result.reason}")
        }
    }
}
