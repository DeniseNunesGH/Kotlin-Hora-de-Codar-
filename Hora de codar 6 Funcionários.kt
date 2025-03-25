data class Lista_de_funcionarios(
    val nome: String,
    val matricula: Int,
    val salario: Double
)

fun main() {

    var funcionarios = mutableListOf<Lista_de_funcionarios>()

    while (true) {
        println(
            """EMPRESA - FINANCEIRO
            |1. Cadastro de Funcionário
            |2. Registro de funcionários (Pesquisa)
            |3. Sair
        """.trimMargin()
        )
        println("Escolha uma opção: ")
        var opcao = readln().toInt()

        when (opcao) {
            1 -> {
                if (funcionarios.size >= 20) {
                    print("Todos os funcionários cadastrados.\n\n")
                } else {
                    println("Nome: ")
                    val nome = readln()

                    println("N° de matrícula: ")
                    val matricula = readln().toInt()

                    println("Salário: ")
                    val salario = readln().toDouble()

                    var funcionario = Lista_de_funcionarios(nome, matricula, salario)
                    funcionarios.add(funcionario)
                    println("\nCadastro concluído.\n\n")
                }
            }

            3 -> {
                println(
                    """Selecione a categoria por função
                    |1. Gerentes (+ R$1.000)
                    |2. Estagiários (- R$1.000)
                    |3. Suportes (R$1.000)
                    |4. Voltar
                """.trimMargin()
                )
                println("Escolha uma opção: ")
                var opcao2 = readln().toInt()

                when (opcao2) {
                    1 -> {
                        var gerente = funcionarios.filter { it.salario > 1000 }
                        gerente.sortedBy { it.matricula }.forEach { println(it) }
                    }

                    2 -> {
                        var estagiario = funcionarios.filter { it.salario < 1000 }
                        estagiario.sortedBy { it.matricula }.forEach { println(it) }
                    }

                    3 -> {
                        var suporte = funcionarios.filter { it.salario == 1000.0 }
                        suporte.sortedBy { it.matricula }.forEach { println(it) }
                    }
                }
                if (opcao2 == 4) {
                }
            }
            3 -> {
                println("\nObrigada por acessar!\n")
                break
            }

            else -> {
                println("?")
            }
        }
    }
}