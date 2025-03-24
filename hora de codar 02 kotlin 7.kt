fun main () {
    //7.

    println("Escreva o primeiro número: ")
    var n1 = readln().toInt()

    println("Escreva o segundo número: ")
    var n2 = readln().toInt()

    println("Escreva o terceiro número: ")
    var n3 = readln().toInt()

    println("Escreva o quarto número: ")
    var n4 = readln().toInt()

    println("Escreva o quinto número: ")
    var n5 = readln().toInt()

    println("Escreva o sexto número: ")
    var n6 = readln().toInt()

    if (72 > n1 or n2 or n3 or n4 or n5 or n6) {
        var soma = n1 + n2 + n3 + n4 + n5 + n6
        println("A soma é de: $soma")
    } else { println("Não há soma.") }


}
