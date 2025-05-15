
fun main() {
    print("Digite o número que você deseja calcular a tabuada: ")
    val num = readLine()?.toDoubleOrNull() ?: 0.0
    println("--------------")

    if (num in 1.0..10.0) {
        for (i in 1..10){
            val multi = num * i
            println("$num x $i = $multi")
        }
    } else {
        println("Erro: número inválido. Digite de 1 a 10.")
    }


}