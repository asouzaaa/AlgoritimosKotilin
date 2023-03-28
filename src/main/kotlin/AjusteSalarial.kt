import java.util.Scanner
fun main() {
    val input = Scanner (System.`in`)

    println("Digite o salário mensal do trabalhador: ")
    val salarioMensal = input.nextDouble()

    println("Digite o percentual de reajuste a ser atríbuido (ex: 10 para 10%): ")
    val percentualReajuste = input.nextDouble()

    val salarioReajustado = salarioMensal + (salarioMensal * percentualReajuste / 100)

    println("O salário mensal do trabalhador era: R$ $salarioMensal")
    println("O percentual de reajuste aplicado foi: R$ $percentualReajuste")
    println("O novo salário mensal do trabalhador é: R$ $salarioReajustado")

}