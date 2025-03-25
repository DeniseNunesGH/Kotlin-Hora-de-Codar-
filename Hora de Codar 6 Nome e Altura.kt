data class Lista_de_registros(
    val nome: String,
    val altura: Double
)

fun main() {
    //cadastrar 15 registros
    //apresentar (nome altura) das pessoas <= 1.5m
    //apresentar (nome altura) >= 1.5m e <= 2.0
    //media de todas as alturas armazenadas
    //sair

    val registros = mutableListOf<Lista_de_registros>()

    while (true) {
        println(
            """Menu
        |1. Registro
        |2. Lista de registros
        |3. Media total
        |4. Sair
    """.trimMargin()
        )
        println("Escolha uma opção: ")
        var opcao = readln().toInt()

        when (opcao) {
            1 -> {
                if (registros.size >= 15) {
                    print("Todos os registros cadastrados.\n\n")
                } else {
                    println("Nome: ")
                    val nome = readln()

                    println("Altura: ")
                    val altura = readln().toDouble()

                    val registro = Lista_de_registros(nome, altura)
                    registros.add(registro)
                    println("Cadastro concluído.\n\n")
                }
            }

            2 -> {
                println("Lista de registros")
                if (registros.isEmpty()) {
                    println("Nenhum registro cadastrado ainda.\n")
                } else {
                    println("Pessoas com altura menor ou igual a 1.5 metros:")
                    registros.filter { it.altura <= 1.5 }.forEach {
                        println("Nome: ${it.nome}, Altura: ${it.altura}")
                    }

                    println("\nPessoas com altura entre 1.5 e 2.0 metros:")
                    registros.filter { it.altura > 1.5 && it.altura <= 2.0 }.forEach {
                        println("Nome: ${it.nome}, Altura: ${it.altura}")
                    }
                }
            }

            3 -> {
                val resultado = registros.map { it.altura }
                    .average() //a funcao map irá buscar por todas as alturas registradas, enquanto average irá calcular a média
                println("Média: $resultado")
            }

            4 -> {
                println("\nObrigada por acessar!\n")
                break
            }

            else -> {
                println("?")
            }
        }
    }
}
