open class Felino(tamanho: Double, peso: Double, idade: Int) :
    Animal(tamanho, peso, idade) {

    override fun vaguear() {
        println("Felino andando silenciosamente...")
    }
}
