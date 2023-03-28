import java.util.Scanner
fun main() {
    val input = Scanner(System.`in`)

    println("Digite a primeira nota: ")
    val nota1 = input.nextDouble()

    println("Digite a segunda nota: ")
    val nota2 = input.nextDouble()

    println("Digite a terceira nota: ")
    val nota3 = input.nextDouble()

    println("Digite a quarta nota: ")
    val nota4 = input.nextDouble()

    val media = (nota1 + nota2 + nota3 + nota4) / 4

    if (media >= 5) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    println("Média obtida pelo aluno: $media")

}