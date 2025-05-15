open class Canino(tamanho: Double, peso: Double, idade: Int) :
    Animal(tamanho, peso, idade) {

    override fun vaguear() {
        println("Canino andando e farejando...")
    }
}
