fun main () {
    println("Escreva o primeiro número: ")
    var n1 = readln().toInt()

    println("Escreva o segundo número: ")
    var n2 = readln().toInt()

    println("Escreva o terceiro número: ")
    var n3 = readln().toInt()

    println("Escreva o quarto número: ")
    var n4 = readln().toInt()

    if (0 < n1 or n2 or n3 or n4 && 10 > n1 or n2 or n3 or n4) {
        var media  = (n1 + n2 + n3 + n4) / 4
        println("Você passou no teste!")
    } else {
        println("Tente novamente.")
    }


}