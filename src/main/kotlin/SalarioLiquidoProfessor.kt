fun main(){
    //Entrada do usuario
    print("Digite o valor da hora-aula: ")
    val valorHora = readLine()!!.toDouble()

    print("Digite o numero de horas trabalhadas no mês: ")
    val numHoras = readLine()!!.toInt()

    print("Digite o percentual de desconto do INSS: ")
    val percINSS = readLine()!!.toDouble()

    //Calculo do salario bruto
    val salarioBruto = valorHora * numHoras

    //Calculo do desconto de INSS
    val inss = salarioBruto * (percINSS / 100)

    val salarioLiquido = salarioBruto - inss

    //Saida dos resultados
    println("Salário bruto: R$ ${"%.2f" .format(salarioBruto)}")
    println("Desconto inss: R$ ${"%.2f" .format(inss)}")
    println("Salário líquido: R$ ${"%.2f" .format(salarioLiquido)}")

}