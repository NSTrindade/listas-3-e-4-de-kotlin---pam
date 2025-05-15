fun main() {
    val contaCorrente = ContaCorrente()
    contaCorrente.depositar(1000.0)

    val contaPoupanca = ContaPoupanca()
    contaPoupanca.depositar(500.0)

    val seguro = SeguroDeVida()

    println("Saldo Conta Corrente: ${contaCorrente.obterSaldo()}")
    println("Tributo Conta Corrente: ${contaCorrente.calculaTributos()}")

    println("Saldo Conta Poupança: ${contaPoupanca.obterSaldo()}")
    // contaPoupanca não é tributável, então não calcula tributos

    println("Tributo Seguro de Vida: ${seguro.calculaTributos()}")
}
