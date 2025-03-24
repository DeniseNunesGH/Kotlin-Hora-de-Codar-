fun main () {
    //4.
    var contagem = 15
    var soma = 0
    var quantidade = 0
    var resultado = 0

    while (contagem >= 15 && contagem <= 100) {
        soma += contagem
        contagem ++
        quantidade ++
    }
    resultado = soma / quantidade

    println("Resultado: $resultado")
}