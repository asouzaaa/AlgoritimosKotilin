import java.util.Scanner

fun main() {
    val leitor = Scanner(System.`in`)

    println("Digite o primeiro valor inteiro: ")
    val valor1 = leitor.nextInt()

    println("Digite o segundo valor inteiro: ")
    val valor2 = leitor.nextInt()

    println("Digite o terceiro valor inteiro: ")
    val valor3 = leitor.nextInt()

    val soma = valor1 + valor2 + valor3
    val quadradoDaSoma = soma * soma

    println("Os valores digitados: $valor1, $valor2 e $valor3")
    println("O quadrado da soma dos tres valores é: $quadradoDaSoma")
}