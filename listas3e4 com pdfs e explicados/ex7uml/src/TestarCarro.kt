// Classe com método main para testar as classes
//singleton, mas metodo com static
object TestarCarro {
    //só roda com isso
    @JvmStatic
    fun main(args: Array<String>) {
        val carro1 = Carro_terrestre()
        carro1.cor = "Azul"
        carro1.modelo = "Sedan"
        carro1.ligarCarro()
        carro1.acelerarCarro()
        carro1.frearCarro()

        println("-----------")

        val carro2 = Carro_Anfibio()
        carro2.cor = "Verde"
        carro2.modelo = "AnfíbioX"
        carro2.ligarCarro()
        carro2.acelerarCarro()
        carro2.acelerarMar()
    }
}
