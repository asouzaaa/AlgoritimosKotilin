fun main() {
    val numeros = IntArray(12)

    //Ler os 12 elementos numericos inteiros
    for (i in numeros.indices){
        print("Digite o ${i + 1}º numero: ")
        numeros[i] = readLine()!!.toInt()
    }

    //Ordenar os elementos em ordem decrescente
    numeros.sortDescending()

    //Apresentar os elementos ordenados
    println("Elementos ordenados em ordem decrescente: ")
    numeros.forEach { numero -> print("$numero ") }

}