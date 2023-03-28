fun fizzBuzz(start: Int, end: Int) {
    if (end <= start){
        println("O número final deve ser maior que o número inicial, programa encerrado")
        return
    }

    for (i in start..end){
        when {
            i % 3 == 0 && 5 == 0 -> println("FizzBuzz")
            i % 3 == 0 -> println("Fizz")
            i % 5 == 0 -> println("Buzz")
            else -> println(i)
        }
    }

}

fun main(){
    println("Digite o número inicial do intervalo: ")
    val start = readLine()?.toInt() ?: 0
    println("Digite o número final do intervalo: ")
    val end = readLine()?.toInt() ?: 0

    fizzBuzz(start, end)
}