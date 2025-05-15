fun String.firstName() : String {
    return this.split(" ")[0]
}

fun main() {
    print("Insira seu nome completo: ")
    var nomeInteiro = readLine()?.toString()
    println(nomeInteiro?.firstName()) //
}