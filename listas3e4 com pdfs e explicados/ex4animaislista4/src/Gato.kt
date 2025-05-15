class Gato(tamanho: Double, peso: Double, idade: Int) :
    Felino(tamanho, peso, idade) {

    override fun fazerBarulho() {
        println("Gato miando...")
    }

    override fun comer() {
        println("Gato comendo ração...")
    }
}