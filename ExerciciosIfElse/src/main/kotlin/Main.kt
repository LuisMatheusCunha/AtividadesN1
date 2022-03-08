fun main(args: Array<String>) {

    atividade04()
    atividadeTriangulo()
    atividadeAnoBissexto()
    atividadeDoCrime()

}

// ATIVIDADE DO TRIANGULO
fun atividadeTriangulo():Unit{
    println("De o valor para o lado1: ")
    val lado1 = readLine()!!.toFloat()
    println("De o valor para o lado2: ")
    val lado2 = readLine()!!.toFloat()
    println("De o valor para o lado3: ")
    val lado3 = readLine()!!.toFloat()


    if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
        println("O Triângulo é Equilátero.")
    }else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado1 != lado2){
        println("O Ttriângulo é Isósceles.")
    }else{
        println("O Triângulo é Escaleno")
    }
}


// ATIVIDADE DO ANO BISSEXTO
fun atividadeAnoBissexto():Unit{
    println("Digite um ano: ")
    val ano = readLine()!!.toInt()

    if(ano % 4 == 0 && ano % 100 != 0){
        println("Ano é Bissexto")
    }else if(ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
        println("Ano é Bissexto")
    } else
        println("Ano não é Bissexto")
}

//ATIVIDADE VITIMA
fun atividadeDoCrime(): Unit {
    var contagem = 0
    println("1- Telefonou para a vítima? ")
    if (readLine()!!.equals("s", true)) contagem++
    println("2- Esteve no local do crime?")
    if (readLine()!!.equals("s", true)) contagem++
    println("3- Mora perto da vítima? ")
    if (readLine()!!.equals("s", true)) contagem++
    println("4- Devia para a vítima? ")
    if (readLine()!!.equals("s", true)) contagem++
    println("5- Já trabalhou com a vítima? ")
    if (readLine()!!.equals("s", true)) contagem++

    if (contagem == 5) {
        println("Você é Assasino!")
    } else if (contagem == 3 || contagem == 4) {
        println("Você é Cumplice!")
    } else if (contagem == 2) {
        println("Você é Suspeito!")
    } else {
        println("Você é Inocente!")
    }
}



fun atividade04(): Double{

    println("Escolha um dos produtos:\nG - Gasolina\nA - Alcool")
    val produto = readLine()!!

    if (produto.equals("A", true)) {
        println("Escolha quantos litros de Alcool voçê deseja: ")
        val alcool = readLine()!!.toFloat()
        val totalA = calcularAlcool(alcool)
        println("O valor do seu produto é ${totalA}")

    }else{
        println("Escolha quantos litros de Gasolina voçê deseja: ")
        val gasolina = readLine()!!.toFloat()
        val totalG = calcularAlcool(gasolina)
        println("O valor do seu produto é ${totalG}")
    }
    return 0.0
}
fun calcularAlcool(alcool: Float){
    if (alcool <= 20) {
        ((alcool * 0.03) / alcool) * 3
    }else{
        ((alcool * 0.05) / alcool) * 3
    }

}
fun calcularGasolina(gasolina: Float){
    if (gasolina <= 20) {
        ((gasolina * 0.03) + gasolina) * 6
    }else{
        ((gasolina * 0.05) + gasolina) * 6
    }

}




