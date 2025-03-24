fun main () {
    //6.
        var aprovados = 0
    //fazer a variável 'aprovados' fora do loop WHILE (true) senão ela irá se repetir

    while (true) {
        print("Nota 1: ")
        var n1 = readln().toDouble()

        print("Nota 2: ")
        var n2 = readln().toDouble()

        var media = n1 + n2 / 2

        if (media >= 9.5) {
            println("Aluno aprovado!")
            aprovados ++
        } else {
            print("Aluno reprovado!\n")
        }

        println("""Calcular a média de outro aluno? 
            |1. Sim
            |2. Não
        """.trimMargin())
        var opcao = readln().toInt()
        if (opcao == 2) {
            break
        }
    }
    print("Quantidade de alunos aprovados: $aprovados")
}