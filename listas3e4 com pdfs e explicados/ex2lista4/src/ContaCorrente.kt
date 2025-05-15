class ContaCorrente : Conta(), Tributavel {
    override fun calculaTributos(): Double { //diz que essa mesma funcao exerce um "efeito" diferente aqui
        return saldo * 0.01 // 1% do saldo
    }
}
