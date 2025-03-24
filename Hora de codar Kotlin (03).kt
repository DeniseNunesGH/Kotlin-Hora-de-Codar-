fun main() {

    //3
    //Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

    println("Informe seu nome: ")
    var nome = readln()

    println("Informe a sua idade: ")
    var idade = readln().toInt()

    println("Olá, $nome, sua idade é $idade.")

}