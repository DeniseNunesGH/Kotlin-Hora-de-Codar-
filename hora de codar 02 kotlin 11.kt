fun main () {



    println("Informe o primeiro valor: ")
    var n1 = readln().toDouble()

    println("Informe o segundo valor: ")
    var n2 = readln().toDouble()

    //1. Adição; 2. Subtração; 3. Divisão; 4. Multiplicação

    println("Operação: ")
    var char = readln()

    var resposta = 0.0

    if (char == "+") {
        resposta = (n1 + n2)
    } else if  (char == "-") {
        resposta = (n1 - n2)
    } else if  (char == "*") {
        resposta = (n1 * n2)
    } else if (char == "/") {
        resposta = (n1 / n2)
    }

    println("O resultado da operação é: $resposta")
}