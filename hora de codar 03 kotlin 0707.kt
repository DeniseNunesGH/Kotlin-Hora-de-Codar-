fun main() {
    val totalNotas = 6
    var somaNotas = 0.0

    for (i in 1..totalNotas) {
        var nota: Double
        while (true) {
            print("Digite a nota $i (entre 0 e 10): ")
            nota = readLine()?.toDoubleOrNull() ?: -1.0
            if (nota in 0.0..10.0) {
                break // sai do loop se a nota for válida
            } else {
                println("Valor inválido. Insira uma nota entre 0 e 10.")
            }
        }
        somaNotas += nota // adiciona a nota válida à soma
    }

    val media = somaNotas / totalNotas
    println("\nA média do aluno é: %.2f".format(media))
}