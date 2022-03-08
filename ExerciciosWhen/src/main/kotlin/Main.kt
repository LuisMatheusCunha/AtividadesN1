fun main(args: Array<String>) {
    taxaNatalidadeMortalidade()
    produtoEFormaDePagamento()
}

fun produtoEFormaDePagamento():Unit{
    println("Digite o valor do produto:")
    val valorProduto = readLine()!!.toFloat()
    println("Escolha uma forma de pagamento:\n1 - à vista\n2 - à prazo(30 dias)\n3 - à prazo parcelado")

    when(readLine()!!.toInt()){
    1-> println("O valor do seu produto é ${valorProduto * 0.10}")
    2-> println("O valor do seu produto é ${(valorProduto * 0.03) + valorProduto}")
    3-> println("O valor do seu produto é ${(valorProduto * 0.015) + valorProduto}")


        else-> println("Operação invalida!!!")
    }

}
fun taxaNatalidadeMortalidade():Unit{

    println("Escolha o tipo de taxa que deseja calcular:\n1 - Taxa de Natalidade\n2 - Taxa de Mortalidade")
    when(readLine()!!.toInt()){
        1 -> {println("Digite o numero de crianças nascidas")
                val criancasNascidas = readLine()!!.toFloat()
                println("Digite a quantidade de habitantes")
                val qtdDeHabitantes = readLine()!!.toFloat()
                println("O resultado da taxa de Natalidade é ${(criancasNascidas * 1000) / qtdDeHabitantes}")}

        2 -> {println("Digite o numero de óbitos")
                val numObito = readLine()!!.toFloat()
                println("Digite a quantidade de habitantes")
                val qtdDeHabitantes2 = readLine()!!.toFloat()
                println("O resultado da taxa de Mortalidade é ${(numObito * 1000) / qtdDeHabitantes2}")}

        else -> println("Tipo de taxa escolhido invlálido")
    }
}
