class Hipopotamo(tamanho: Double, peso: Double, idade: Int) :
    Animal(tamanho, peso, idade) {

    override fun fazerBarulho() {
        println("Hipopótamo roncando...")
    }

    override fun comer() {
        println("Hipopótamo comendo plantas...")
    }
}
