data class usuario (

        val saldo: Double,
        val senhaCorreta: Int
        )

fun main () {

    println("Nome de Usuário: ")
    var nome = readln()

    println("Olá, $nome, é um prazer ter você por aqui!")

    while (true) {
        println("""Escolha uma opção:
            |1. Saldo
            |2. Extrato
            |3. Saque
            |4. Depósito
            |5. Transferência
            |6. Sair
        """.trimMargin())
        var opcao = readln().toInt()

        when (opcao){
            1 -> {

            }
            2 -> {

            }
            3 -> {

            }
            4 -> {

            }
            5 -> {

            }
            6 -> {

            }
        }
    }

}