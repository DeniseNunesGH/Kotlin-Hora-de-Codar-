import javax.security.sasl.RealmCallback

data class Lista_de_cadastros (
    var nome: String,
    var media: Double,
    var resultado: String)


fun main () {
    //20 registros (classifica-los por nomes)
    //pesquisa 20 registros de cada vez, também com a média e mensagem aprovado/reprovado
    //Aprovado >= 5 e/ou Reprovado <= 5
    //apresentar registros, médias e mensagem de aprovação ou reprovação
    //sair

    val cadastros = mutableListOf<Lista_de_cadastros>()

    while (true) {
        println(
            """Técnicas de Programação - Alunos
        |1. Cadastrar
        |2. Lista de Cadastros
        |3. Pesquisa
        |4. Sair
    """.trimMargin()
        )
        println("Escolha uma opção: ")
        var opcao = readln().toInt()

    when (opcao) {
        1 -> {
            if (cadastros.size >= 20) {
                print("Todos os alunos cadastrados.\n\n")
            } else {
                println("Aluno: ")
                val nome = readln()

                println("Nota 1: ")
                val nota1 = readln().toDouble()

                println("Nota 2: ")
                val nota2 = readln().toDouble()

                val media = (nota1 + nota2) / 2

                var resultado = if (media >= 5) "Aprovado" else "Reprovado"
                cadastros.add(Lista_de_cadastros(nome, media, resultado))
                cadastros.sortedBy { it.nome }
                println("Cadastro concluído.\n\n")
            }
        }
        2 -> {
            println("Alunos: ")
            if (cadastros.isEmpty()) {
                println("Cadastros não encontrados.\n\n")
            } else {
                cadastros.forEachIndexed { index, Lista_de_cadastros ->
                    println("${index + 1}. Nome: ${Lista_de_cadastros.nome}\n Media: ${Lista_de_cadastros.media}\n Resultado: ${Lista_de_cadastros.resultado}\n\n")
                }
            }
        }
        3 -> {
            println("Pesquisar cadastro: ")
            var pesquisa = readln()
            var resultados = cadastros.find {it.nome.equals(pesquisa, ignoreCase = true) }

            if (resultados != null) {

                println("Cadastros encontrados ")
                println("Nome: ${resultados.nome}\n Media: ${resultados.media}\n Resultado: ${resultados.resultado}\n\n")
            } else {
                println("Nenhum cadastro encontrado.\n\n")
            }
        }
        4 -> {
            println("\nObrigada por acessar!\n")
            break
        } else -> {
            println("?")
        }
    }
    }
    }