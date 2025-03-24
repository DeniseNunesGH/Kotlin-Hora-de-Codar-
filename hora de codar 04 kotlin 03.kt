fun main () {
    var frutas = mutableListOf("maçã", "uva", "pêra")
//criar array

    println("Lista de compras: " + frutas)
//exibir ao usuario


    while (frutas.isNotEmpty()) {
        println("Informe uma fruta para ser removida")
    var fruta = readln()
//pedir para digitar o nome de uma das frutas

    if (fruta in frutas) {
        frutas.remove(fruta)
        println("$fruta foi removida.")
    } else { //caso esteja no array, remover e exibir "fruta foi removida"
        println("$fruta indisponível no nosso mercado.")
    }
}
    println("Lista de compras finalizada")
//peça para novamente para o usuario digitar o nome de uma fruta para ser removida

//sempre que o usuario procurar por uma fruta qua não está no array exiba a mensagem "fruta indisponivel no nosso mercado"

//quando o array não possuir mais itens dentro de si, escreva "lista de compras finalizada"
}