fun main() {
    println("Digite um numeral romano entre (I,V,X,L,C,D,M): ")
    val romanInput = readLine()!!

    try {
        val intValue = romanToInteger(romanInput.toUpperCase())
        println("O valor inteiro correspondente é: $intValue")
    } catch (e: IllegalArgumentException) {
        println("Entrada inválida: ${e.message}")
    }
}

fun romanToInteger(s: String): Int {
    val romanValues = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var intValue = 0
    var lastValue = 0

    for (c in s) {
        val currentValue = romanValues[c] ?: throw IllegalArgumentException("Caractere inválido: $c")

        if (currentValue > lastValue) {
            intValue += currentValue - 2 * lastValue
        } else {
            intValue += currentValue
        }
        lastValue = currentValue
    }

    return intValue
}