class Leao(tamanho: Double, peso: Double, idade: Int) :
    Felino(tamanho, peso, idade) {

    override fun fazerBarulho() {
        println("Leão rugindo!")
    }

    override fun comer() {
        println("Leão comendo carne...")
    }
}
