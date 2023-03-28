fun main() {
    val inicio = 1
    val fim = 100

    println("Intervalo informado: $inicio a $fim")
    var soma = 0
    for (i in inicio..fim){
        soma += i
    }

    println("Resultado da soma: $soma")
}