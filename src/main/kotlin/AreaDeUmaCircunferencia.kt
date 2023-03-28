import kotlin.math.PI

const val PI = 3.14159265
fun main(){
    print ("Digite o raio da circunferencia: ")
    val raio = readLine()?.toDoubleOrNull()

    if (raio != null){
        val area = calcularAreaCircunferencia(raio)
        println("A area da circunferencia é: $area")
    } else {
        println("Valor inválido. Por favor, insira um número valido.")
    }
}

fun calcularAreaCircunferencia(raio: Double): Double {
    //Elevar o raio ao quadrado e multiplicar por π
    return PI * Math.pow(raio, 2.0)
}