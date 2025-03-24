fun main () {
    //2.

    println("Insira o primeiro valor: ")
    var valor1 = readln().toDouble()
    //double = o double ele vê o número quebrado, das outras casas decimais, então tem que tomar atento quando os cálculos são de divisão, pois as vezes pode ser um número quebrado

    println("Insira o segundo valor: ")
    var valor2 = readln().toDouble()

    while (valor2 <= 0) {
        println("Insira um novo valor válido")
        print(valor2)
    }
    var resultado: Double = (valor1 / valor2)
        println("O valor total é: $resultado")


}