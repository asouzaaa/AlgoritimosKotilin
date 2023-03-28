import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite o primeiro valor: ")
    val valor1 = scanner.nextInt()

    println("Digite o segundo valor: ")
    val valor2 = scanner.nextInt()

    println("Digite o terceiro valor: ")
    val valor3 = scanner.nextInt()

    val somaDosQuadrados = valor1 * valor1 + valor2 * valor2 + valor3 * valor3
    println("A soma dos quadrados dos valores digitados é: $somaDosQuadrados")

}