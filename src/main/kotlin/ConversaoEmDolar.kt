import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Digite o valor da cotação atual do real (R$): ")
    val taxadeConversao = scanner.nextDouble()

    println("Digite a quantidade de reais (R$) disponivel com o usuario: ")
    val quantidadeDisponivel = scanner.nextDouble()

    println("Digite o valor em real (R$) que deseja converter em dolares (US$): ")
    val valorEmReal = scanner.nextDouble()

    if (valorEmReal > quantidadeDisponivel){
        println("Voce não possui saldo suficiente em reais para realizar essa conversão.")
    } else {
        val valorEmDolar = converterRealParaDolar(valorEmReal, taxadeConversao)
        val resultadoConversao = "O valor de R$ $valorEmReal convertido em dolares é: US$ $valorEmDolar "
        println(resultadoConversao)
    }
}

fun converterRealParaDolar(valorEmDolar: Double, taxaDeConversao: Double): Double{
    return valorEmDolar * taxaDeConversao
}