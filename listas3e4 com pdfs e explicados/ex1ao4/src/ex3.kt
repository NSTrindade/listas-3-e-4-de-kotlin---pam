// Classe aberta que permite herança
open class Temperatura {

    // Variável para armazenar a temperatura em Celsius
    var C: Double = 0.0

    // Função para ler a temperatura em Celsius
    fun Celsius(): Double {
        print("Insira a temperatura em Celsius: ")
        C = readLine()?.toDoubleOrNull() ?: 0.0 // Armazena o valor digitado ou 0.0 se for inválido
        return C // Corrigido: retorna o valor lido
    }

    // Função para converter Celsius para Fahrenheit
    fun tempf(): Double {
        val calcf = C * 1.8 + 32 // Corrigido: usa a variável de instância C
        println("Valor da temperatura em F: $calcf") // Corrigido: era "k", agora é "F"
        return calcf // Corrigido: retorna o valor calculado
    }

    // Função para converter Celsius para Kelvin
    fun tempk(): Double {
        val calck = C + 273.15 // Corrigido: usa a variável de instância C
        println("Valor da temperatura em K: $calck")
        return calck // Corrigido: retorna o valor calculado
    }
}

// Função principal
fun main(args: Array<String>) {
    val temp = Temperatura()
    temp.Celsius() // Chama a função para ler a temperatura
    temp.tempf()   // Converte e imprime Fahrenheit
    temp.tempk()   // Converte e imprime Kelvin
}
