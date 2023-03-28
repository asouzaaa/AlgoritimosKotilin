import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Digite o valor da cotação atual do dólar (US$): ")
    val taxadeConversao = scanner.nextDouble()

    println("Digite a quantidade de dólares (US$) disponivel com o usuario: ")
    val quantidadeDisponivel = scanner.nextDouble()

    println("Digite o valor em dólares (US$) que deseja converter em reais (R$): ")
    val valorEmDolar = scanner.nextDouble()

    if (valorEmDolar > quantidadeDisponivel){
        println("Voce não possui saldo suficiente em dólares para realizar essa conversão.")
    } else {
        val valorEmReal = converterDolarParaReal(valorEmDolar, taxadeConversao)
        val resultadoConversao = "O valor de US$ $valorEmDolar convertido em reais é: R$ $valorEmReal "
        println(resultadoConversao)
    }
}

fun converterDolarParaReal(valorEmDolar: Double, taxaDeConversao: Double): Double{
    return valorEmDolar * taxaDeConversao
}