fun main() {
    val gato = Gato(0.5, 4.0, 2)
    val leao = Leao(2.0, 200.0, 5)
    val cachorro = Cachorro(1.0, 30.0, 3)
    val hipopotamo = Hipopotamo(3.5, 1500.0, 10)

    gato.fazerBarulho()
    leao.comer()
    cachorro.vaguear()
    hipopotamo.dormir()
}
