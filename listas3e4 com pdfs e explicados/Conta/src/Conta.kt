class Conta(
    val numero: Int,
    var saldo: Double,
    val limite: Double,
    val nome: String
) {

    // Métod para sacar dinheiro, só permite se saldo+limite for suficiente
    fun saca(valor: Double): Boolean {
        return if (valor <= saldo + limite) {
            saldo -= valor
            true
        } else {
            false
        }
    }

    // Métod para depositar dinheiro
    fun deposita(valor: Double) {
        saldo += valor
    }

    // Métod para transferir dinheiro para outra conta
    fun transfere(destino: Conta, valor: Double): Boolean {
        if (saca(valor)) {
            destino.deposita(valor)
            return true
        }
        return false
    }
}
