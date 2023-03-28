fun main() {
    println("Jokenpo Sheldon Cooper")
    println("Jogador 1, escolha sua jogada: Pedra, Papel, Tesoura, Lagarto ou Spock")
    val jogada1 = readLine()?.toLowerCase()?.trim()
    println("Jogador 2, escolha sua jogada: Pedra, Papel, Tesoura, Lagarto ou Spock")
    val jogada2 = readLine()?.toLowerCase()?.trim()

    if (jogada1 != null && jogada2 != null) {
        when (jogada1 to jogada2) {
            "pedra" to "pedra", "papel" to "papel", "tesoura" to "tesoura", "lagarto" to "lagarto", "spock" to "spock" -> {
                println("Empate!")
            }
            "tesoura" to "papel", "papel" to "pedra", "pedra" to "lagarto", "lagarto" to "spock", "spock" to "tesoura",
            "tesoura" to "lagarto", "lagarto" to "papel", "papel" to "spock", "spock" to "pedra", "pedra" to "tesoura" -> {
                println("Jogador 1 vence!")
            }
            else -> {
                println("Jogador 2 vence!")
            }
        }
    } else {
        println("Jogada inválida! Certifique-se de digitar corretamente a jogada (Pedra, Papel, Tesoura, Lagarto ou Spock).")
    }
}