// Classe geral (superclasse) para todos os animais
open class Animal(
    val tamanho: Double,
    val peso: Double,
    val idade: Int
) {
    open fun fazerBarulho() {
        println("Animal fazendo barulho...")
    }

    open fun comer() {
        println("Animal comendo...")
    }

    fun dormir() {
        println("Animal dormindo...")
    }

    open fun vaguear() {
        println("Animal vagando por aí...")
    }
}
