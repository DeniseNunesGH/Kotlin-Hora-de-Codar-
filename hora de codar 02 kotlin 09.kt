fun main () {

    println("Escreva seu ano de nascimento: ")
    var data_nasc = readln().toInt()

    if (data_nasc > 2007) {
        println("Você poderá/pode votar este ano!")
    } else { (data_nasc < 2007)
        println("Você ainda não pode votar.")
    }

}