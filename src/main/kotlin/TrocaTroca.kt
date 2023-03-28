import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)

    println("Digite o valor de A: ")
    val a = scanner.nextInt()

    println("Digite o valor de B: ")
    val b = scanner.nextInt()

    println("Os valores de A e B são: A = $a, B = $b")

    //Realizando a troca dos valores de A e B
    val temp = a
    val aTrocado = b
    val bTrocado = temp

    println("Os valores de A e B após a troca são: A = $aTrocado")
    println("Os valores de A e B após a troca são: B = $temp")


}