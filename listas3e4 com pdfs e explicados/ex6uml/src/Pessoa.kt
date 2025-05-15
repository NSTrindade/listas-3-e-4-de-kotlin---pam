// Classe base abstrata Pessoa
abstract class Pessoa {
    // Atributos protegidos, acessíveis pelas subclasses
    protected var nome: String = ""
    protected var endereco: String = ""
    protected var telefone: String = ""
    protected var bairro: String = ""
    protected var cep: Long = 0
    protected var cidade: String = ""
    protected var estado: String = ""


    fun conPes(): Int {
        return 1
    }
}
