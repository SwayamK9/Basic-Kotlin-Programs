class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        balance += amount
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()
    account.deposit(500.0)
    account.deposit(250.0)
    println(account.getBalance())
}
