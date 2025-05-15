class Cachorro(tamanho: Double, peso: Double, idade: Int) :
    Canino(tamanho, peso, idade) {

    override fun fazerBarulho() {
        println("Cachorro latindo!")
    }

    override fun comer() {
        println("Cachorro comendo ração...")
    }
}