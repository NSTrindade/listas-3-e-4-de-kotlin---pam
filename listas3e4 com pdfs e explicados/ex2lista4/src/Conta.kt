open class Conta {
    protected var saldo: Double = 0.0

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            saldo -= valor
        } else {
            println("Saldo insuficiente.")
        }
    }

    fun obterSaldo(): Double {
        return saldo
    }
}
