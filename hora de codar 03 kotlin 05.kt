fun main () {
    //5.

    println("1° número: ")
    var n1 = readln().toDouble()

    println("2° número: ")
    var n2 = readln().toDouble()

    var soma = 0.0
    var media = 0.0
    var resultado = 0.0

    while (n1 <= n2){
        soma += n1
        media ++
        n1 ++
    }

    resultado = soma / media

    println("Resultado: $resultado")
}