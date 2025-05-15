fun main() {
    val conta1 = Conta(numero = 123, saldo = 500.0, limite = 100.0, nome = "João")
    val conta2 = Conta(numero = 456, saldo = 300.0, limite = 50.0, nome = "Maria")

    println("Saldo inicial conta1: ${conta1.saldo}")
    println("Saldo inicial conta2: ${conta2.saldo}")

    // João transfere 200 para Maria
    if (conta1.transfere(conta2, 200.0)) {
        println("Transferência realizada com sucesso!")
    } else {
        println("Saldo insuficiente para transferência.")
    }

    println("Saldo final conta1: ${conta1.saldo}")
    println("Saldo final conta2: ${conta2.saldo}")
}
