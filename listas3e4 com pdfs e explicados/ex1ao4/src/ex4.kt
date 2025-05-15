// Classe aberta que permite herança
open class GrupoPessoas {

    // Lista para armazenar as alturas
    private val alturas = mutableListOf<Double>()

    // Lista para armazenar os sexos ('M' para masculino, 'F' para feminino)
    private val sexos = mutableListOf<Char>()

    // Função para coletar os dados das 10 pessoas
    fun coletarDados() {
        for (i in 1..10) {
            print("Insira a altura da pessoa $i (em metros): ")
            val altura = readLine()?.toDoubleOrNull() ?: 0.0
            alturas.add(altura)

            print("Insira o sexo da pessoa $i (M para masculino, F para feminino): ")
            val sexo = readLine()?.uppercase()?.firstOrNull() ?: 'F'
            sexos.add(sexo)
        }
    }

    // a) Função para encontrar a maior e a menor altura
    fun maiorEMenorAltura() {
        val maior = alturas.maxOrNull() ?: 0.0
        val menor = alturas.minOrNull() ?: 0.0
        println("Maior altura do grupo: $maior m")
        println("Menor altura do grupo: $menor m")
    }

    // b) Função para calcular a média de altura dos homens
    fun mediaAlturaHomens(): Double {
        var soma = 0.0
        var contador = 0

        for (i in 0 until alturas.size) {
            if (sexos[i] == 'M') {
                soma += alturas[i]
                contador++
            }
        }

        val media = if (contador > 0) soma / contador else 0.0
        println("Média de altura dos homens: $media m")
        return media
    }

    // c) Função para contar o número de mulheres
    fun numeroMulheres(): Int {
        val qtd = sexos.count { it == 'F' }
        println("Número de mulheres: $qtd")
        return qtd
    }
}

// Função principal
fun main(args: Array<String>) {
    val grupo = GrupoPessoas()
    grupo.coletarDados()         // Coleta os dados das 10 pessoas
    grupo.maiorEMenorAltura()    // Exibe maior e menor altura
    grupo.mediaAlturaHomens()    // Exibe média de altura dos homens
    grupo.numeroMulheres()       // Exibe número de mulheres
}
