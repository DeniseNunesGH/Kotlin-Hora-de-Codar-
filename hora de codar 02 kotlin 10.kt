fun main () {

    println("Altura: ")
    var altura = readln().toFloat()

    println("Gênero biológico \n(1. Fem) (2.Masc.)")
    var genero = readln().toInt()

    if (genero == 1) {
        var feminino = (62.1 * altura) - 44.7
        println("Seu IMC é: $feminino")
    } else { (genero == 2)
        var masculino = (72.7 * altura) - 58
        println("Seu IMC é: $masculino")
    }
}