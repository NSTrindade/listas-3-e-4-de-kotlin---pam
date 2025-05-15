// Classe base Carro
open class Carro {
    public var cor: String = ""
    public var modelo: String = ""
    public var motor: String = ""
    public var ano: Int = 0
    public var chassi: Int = 0

   // as funcoes ja estao publicas, por padrao
    //descobri isso, nao vou mais colocar public na frente, pois fica redundante.
    fun ligarCarro() {
        println("Carro ligado.")
    }

    fun acelerarCarro() {
        println("Carro acelerando...")
    }

    fun frearCarro() {
        println("Carro freando.")
    }

    fun mudarMarcha() {
        println("Marcha alterada.")
    }

    fun brecar() {
        println("Carro brecando.")
    }
}
