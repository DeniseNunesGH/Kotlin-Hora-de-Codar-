fun main () {

    var planetas = mutableListOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")


    println("Sistema solar:" + planetas)

    println("Informe um planeta: ")
    var um_planeta = readln()

    if (planetas.contains(um_planeta)) {
        println("Este planeta já está no sistema solar.")
    } else { println("Este planeta não está no sistema solar.")
    }
}



//falta somente verificar se o planeta está na mutablelist

//array é uma lista imutável, mutablelist é uma lista mutável, a partir da adição de mais variáveis apenas