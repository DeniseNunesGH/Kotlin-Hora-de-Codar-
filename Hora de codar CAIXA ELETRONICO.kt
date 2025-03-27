import kotlin.system.exitProcess //importando um sistema para finalizar o programa

fun main() {
    println("Informe o nome de usuário: ") //1. OK
    var nome = readln()

    println("Olá $nome, é um prazer ter você por aqui!")
    inicio()
}

var saldo = 250.0
val senhaCorreta = 3589


fun inicio() {

    println(
        """MENU
        |1. Saldo
        |2. Extrato
        |3. Saque
        |4. Deposito
        |5. Transferência
        |6. Sair
    """.trimMargin()
    )
    val escolha = readLine()?.toIntOrNull()

    when (escolha) { //2.OK
        1 -> verSaldo()
        2 -> verExtrato() //5. OK
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> fazerTransferencia() //8. OK
        6 -> sair()
        else -> erro() //9. OK
    }
    println("Escolha uma opção: ")


}

fun verSaldo() {

    println("Informe sua senha: ")
    var senha = readln().toIntOrNull()
    if (senha != senhaCorreta) {
        println("Senha incorreta")
    }

    println("Seu saldo atual é: $saldo")
    inicio()
}

fun verExtrato() {

    println("Informe sua senha: ")
    var senha = readln().toIntOrNull()
    if (senha != senhaCorreta) {
        println("Senha incorreta")
    }

    println(
        """EXTRATO
        |-----------------------------|
        |deposito ------------ R$25.00|
        |-----------------------------|
        |-----------------------------|
        |deposito ----------- R$225.00|
        |-----------------------------|
        |Saldo atual -------- R$250.00|
    """.trimMargin()
    )
}

fun fazerDeposito() {

    println("Informe sua senha: ")
    var senha = readln().toIntOrNull()
    if (senha != senhaCorreta) {
        println("Senha incorreta")
    }

    print("Qual o valor para depósito? ")
    val deposito = readLine()?.toFloatOrNull()

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else {
        saldo += deposito
        verSaldo()
    }
}

fun fazerSaque() {
    //4.
    println("Informe sua senha: ")
    var senha = readln().toIntOrNull()
    if (senha != senhaCorreta) {
        println("Senha incorreta")
    }

    print("Qual o valor para saque? ")
    val saque = readln().toFloatOrNull()

    if (saque == null) {
        println("Por favor, informe um número válido.")
        fazerSaque()
    } else if (saque <= 0) {
        println("Operação não autorizada.")
        fazerSaque()
    } else {
        saldo -= saque
        verSaldo()
    }
}

fun fazerTransferencia() { //

    println("Informe sua senha: ")
    var senha = readln().toIntOrNull()
    if (senha != senhaCorreta) {
        println("Senha incorreta")
    }

    println("Informe o numero da conta (somente dígitos): ")
    var numeroConta = readln().toInt()
//não permitir caracteres além dos números

    println("Valor da transferência: ")
    var quantia = readln().toInt()
    if (quantia <= 0) {
        println("Opção invalida. Tente novamente.") //7. OK
        fazerTransferencia()
    }
}

fun erro() {
    println("Por favor, informe um número entre 1 e 6.")
    inicio()
}

fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readln().uppercase() //uppercase - letra maiúscula ou minúscula

    when (confirma) {
        "S" -> exitProcess(0)
        "N" -> inicio()
        else -> sair()
    }
}
