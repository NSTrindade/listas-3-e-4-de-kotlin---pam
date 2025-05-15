class SeguroDeVida : Tributavel {
    override fun calculaTributos(): Double { //diz que essa mesma funcao exerce um "efeito" diferente aqui
        return 42.0 // taxa fixa
    }
}
