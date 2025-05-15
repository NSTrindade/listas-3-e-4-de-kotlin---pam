fun String.lastName() : String {
    return this.split(" ").last() // Retorna o último nome
}

fun main() {
    print("Insira seu nome completo: ")
    var nomeInteiro = readLine()?.toString()
    println(nomeInteiro?.lastName()) //
}