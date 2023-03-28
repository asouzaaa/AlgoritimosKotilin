import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)

    println("Digite a distancia percorrida pelo projétil em quilômetros: ")
    val distanciaemKm = scanner.nextDouble()

    println("Digite o tempo gasto pelo projétil em minutos: ")
    val tempoEmMinutos = scanner.nextDouble()

    val velocidadeMetrosPorSegundo = calcularVelocidade(distanciaemKm, tempoEmMinutos)
    println("A velocidade do projétil é: $velocidadeMetrosPorSegundo m/s")
}

fun calcularVelocidade(distancia: Double, tempo: Double): Double{
    val distanciaMetros = distancia * 1000
    val tempoSegundos = tempo * 60

    return distanciaMetros / tempoSegundos
}