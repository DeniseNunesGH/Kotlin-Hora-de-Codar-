//dataclas = classificação de data/dados
data class Lista_de_contatos(
    var nome: String,
    var endereco: String,
    var telefone: String)

//a var nome do dataclass vai coletar todas as variáveis, enquanto abaixo serão definidauma por uma e registradas na dataclass

fun main () {

    var contatos = mutableListOf<Lista_de_contatos>()


    while (true) {
        println("Menu Agenda\n\n")
        println("Opções: \n" +
                "\n 1. Adicionar contato" +
                "\n 2. Contatos" +
                "\n 3. Pesquisar" +
                "\n 4. Sair")

        println("Escolha uma opção: ")
        var opcao = readln().toInt()

        when (opcao) {
            1 -> {

                if (contatos.size >= 10) {
                    println("Limite de contatos excedido.")
                } else {

                    println("Nome: ")
                    var nome = readln()

                    println("Endereço: ")
                    var endereco = readln()

                    println("Telefone: ")
                    var telefone = readln()

                    contatos.add(Lista_de_contatos(nome, endereco, telefone))
                    println("Contato adicionado na Agenda.\n")
                }
            }
            2 -> {
                println("Contatos: ")
                if (contatos.isEmpty()) {
                    println("Agenda vazia.")
                } else {
                    contatos.forEachIndexed { index, Lista_de_contatos ->
                        println("${index + 1}. Nome: ${Lista_de_contatos.nome}, Endereço: ${Lista_de_contatos.endereco}, Telefone: ${Lista_de_contatos.telefone}")
                        //for each index = para cada anexado/indexado
                    }
                }
            }
            3 -> {
                println("Pesquisar contato: ")
                var pesquisa = readln()
                var resultados = contatos.find { it.nome.equals(pesquisa, ignoreCase = true) }

                if (resultados != null) {

                    println("Resultados da pesquisa: ")
                    println("Nome: ${resultados.nome}\n, Endereço: ${resultados.endereco}\n, Telefone: ${resultados.telefone}")
                } else {
                    println("Nenhum contato encontrado com o nome: $pesquisa")
                }
            }
            4 -> {
                println("Programa agenda finalizado.")
                break
            }
            else -> {
                println("?")
            }
        }
    }
}