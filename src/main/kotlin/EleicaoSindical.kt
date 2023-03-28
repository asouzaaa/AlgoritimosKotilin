import java.util.Scanner

fun main(){
    val input = Scanner(System.`in`)
    println("Eleição Sindical - Apuração dos votos")

    println("Digite a quantidade de votos válidos do candidato 1: ")
    val votosCandidato1 = input.nextInt()

    println("Digite a quantidade de votos válidos do candidato 2: ")
    val votosCandidato2 = input.nextInt()

    println("Digite a quantidade de votos válidos do candidato 3: ")
    val votosCandidato3 = input.nextInt()

    println("Digite a quantidade de votos nulos: ")
    val votosNulos = input.nextInt()

    println("Digite a quantidade de votos em branco: ")
    val votosEmBranco = input.nextInt()

    val totalEleitores = votosCandidato1 + votosCandidato2 + votosCandidato3 + votosNulos + votosEmBranco
    val votosValidos = votosCandidato1 + votosCandidato2 + votosCandidato3

    println("\nResultado da eleição:")
    println("Total de eleitores: $totalEleitores")
    println("Percentutal de votos válidos: ${votosValidos * 100.0 / totalEleitores}%")
    println("Percentutal de votos do candidato 1: ${votosCandidato1 * 100.0 / totalEleitores}%")
    println("Percentutal de votos do candidato 2: ${votosCandidato2 * 100.0 / totalEleitores}%")
    println("Percentutal de votos do candidato 3: ${votosCandidato3 * 100.0 / totalEleitores}%")
    println("Percentutal de votos nulos: ${votosNulos * 100.0 / totalEleitores}%")
    println("Percentutal de votos em branco: ${votosEmBranco * 100.0 / totalEleitores}%")

}