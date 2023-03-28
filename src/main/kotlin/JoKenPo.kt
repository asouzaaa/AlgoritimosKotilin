fun main() {
    println("Jogador 1, insira sua jogada (Pedra, Papel ou Tesoura):")
    val jogada1 = readLine()?.toLowerCase()
    println("Jogador 2, insira sua jogada (Pedra, Papel ou Tesoura):")
    val jogada2 = readLine()?.toLowerCase()

    val resultado = verificarVencedor(jogada1, jogada2)
    println(resultado)
}

fun verificarVencedor(jogada1: String?, jogada2: String?): String {
    if (jogada1 == jogada2) {
        return "Empate!"
    }

    return when (jogada1) {
        "pedra" -> if (jogada2 == "tesoura") "Jogador 1 venceu!" else "Jogador 2 venceu!"
        "papel" -> if (jogada2 == "pedra") "Jogador 1 venceu!" else "Jogador 2 venceu!"
        "tesoura" -> if (jogada2 == "papel") "Jogador 1 venceu!" else "Jogador 2 venceu!"
        else -> ({

        }).toString()
    }
}