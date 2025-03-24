fun main() {

    //4
    //Considerando a figura abaixo, escreva um programa para cada forma que calcule e exiba em tela cada uma de suas respectivas áreas. O usuário irá informar os valores de cada variável.


    println("Informe a altura do retângulo: \n")
    var altura_retangulo = readln()?.toDoubleOrNull() ?:0.0

    println("Informe a base do retângulo: \n")
    var base_retangulo = readln()?.toDoubleOrNull() ?: 0.0

    val a = altura_retangulo * base_retangulo

    //a = altura_retangulo * base_retangulo

    println("A area do retângulo é de: $a \n\n")


    println("Informe um lado de um quadrado: \n")
    var lado_quadrado = readln()?.toDoubleOrNull() ?:0.0

    println("Informe um lado deste mesmo quadrado: \n")
    var lado2_quadrado = readln()?.toDoubleOrNull() ?: 0.0

    val a2 = lado_quadrado * lado2_quadrado

    //a = altura_retangulo * base_retangulo

    println("A area do quadrado é de: $a2 \n\n")


    println("Informe a diagonal maior do losango: \n")
    var diagonal_maior = readln()?.toDoubleOrNull() ?: 0.0

    println("Informe a diagonal menor do losango: \n")
    var diagonal_menor = readln()?.toDoubleOrNull() ?: 0.0

    var a3 = diagonal_maior * diagonal_menor / 2

    println("A area do losango é de: $a \n\n")



    println("Informe a base maior do trapézio: \n")
    var maior_trapezio = readln()?.toDoubleOrNull() ?: 0.0

    println("Informe a base menor do trapézio: \n")
    var menor_trapezio = readln()?.toDoubleOrNull() ?: 0.0

    println("Informe a altura do seu trapezio: \n")
    var alt = readln()?.toDoubleOrNull() ?: 0.0

    val a4 = (maior_trapezio + menor_trapezio) * alt / 2

    println("A area do seu trapézio é de : $a4 \n\n")


    println("Informe a altura do paralelogramo: \n")
    var altura_par = readln()?.toDoubleOrNull() ?:0.0

    println("Informe a base do retângulo: \n")
    var base_par = readln()?.toDoubleOrNull() ?: 0.0

    val a5 = altura_par * base_par

    println("A area do paralelogramo é de: $a5 \n\n")


    println("Informe a altura do triângulo: \n")
    var altura_tri = readln()?.toDoubleOrNull() ?:0.0

    println("Informe a base do retângulo: \n")
    var base_tri = readln()?.toDoubleOrNull() ?: 0.0

    val a6 = altura_tri * base_tri / 2

    println("A area do triângulo é de: $a6 \n\n")


    var pi = 3.14

    println("Informe o raio do círculo: \n")
    var raio = readln()?.toDoubleOrNull() ?: 0.0

    val a7 = pi * (raio * raio)

    println("A area do círculo é de: $a7")
}
