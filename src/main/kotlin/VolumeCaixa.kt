import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    print("Digite o comprimento da caixa retangular: ")
    val comprimento = scanner.nextDouble()

    print("Digite a largura da caixa retangular: ")
    val largura = scanner.nextDouble()

    print("Digite a altura da caixa retangular: ")
    val altura = scanner.nextDouble()

    val volume = calcularVolume(comprimento, largura, altura)
    println("O volume da caixa retangular é: $volume")
}

fun calcularVolume(comprimento: Double, largura: Double, altura: Double): Double {
    return comprimento * largura * altura
}