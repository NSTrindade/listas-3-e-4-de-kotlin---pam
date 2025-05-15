class Lobo(tamanho: Double, peso: Double, idade: Int) :
    Canino(tamanho, peso, idade) {

    override fun fazerBarulho() {
        println("Lobo uivando!")
    }

    override fun comer() {
        println("Lobo comendo carne...")
    }
}