fun main(){
    print("Digite seu nome: ")
    val nome = readLine()
    val mensagem = if (nome != null && nome.isNotBlank()){
        "Um para $nome, um para mim."
    } else {
        "Um para voce, um para mim."
    }
    println(mensagem)
}