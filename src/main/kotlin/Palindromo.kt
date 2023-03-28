import java.io.DataInput
import java.lang.StringBuilder

fun main() {
    print("Digite uma palavra, frase ou número: ")
    val input = readLine() ?: ""

    val cleanedInput = input.replace(Regex("[^A-Za-z0-9]"), "").toLowerCase()
    val reversedInput = cleanedInput.reversed()

    if (cleanedInput == reversedInput){
        println("'$input' é um palíndromo.")
    } else {
        println("'$input' não é um palíndromo.")
        println("Explicação: A versão limpa de '$input' é '$cleanedInput', e sua versão invertida é '$reversedInput'. Como '$cleanedInput' e '$reversedInput' são diferentes, a entrada não é um palíndromo.")
    }
}
