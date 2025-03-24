fun main () {
    //6.

    print("Informe o primeiro valor: ")
    var valor1 = readln().toInt()

    print("Informe o segundo valor: ")
    var valor2 = readln().toInt()

    print("Informe o terceiro valor: ")
    var valor3 = readln().toInt()

    print("Informe o quarto valor: ")
    var valor4 = readln().toInt()

    println("O $valor1 é o primeiro.")
    println("O $valor4 é o último.")

    if (valor1 > valor2 && valor1 > valor3 && valor3 > valor4) {
        println("O $valor1 é o maior!")
    } else if (valor1 == valor2 && valor1 > valor3 && valor1 > valor4) {
        println("Informe um valor diferente.")
    }

    if (valor2 > valor1 && valor2 > valor3 && valor2 > valor4) {
        println("O $valor2 é o maior")
    } else if (valor2 == valor1 or valor3 or valor4) {
        println("Informe um valor diferente.")
    }

    if (valor3 > valor1 && valor3 > valor2 && valor3 > valor4) {
        println("O $valor3 é o maior")
    } else if (valor3 == valor1 && valor3 > valor2 && valor3 > valor4) {
        println("Informe um valor diferente.")
    }

    if (valor4 > valor1 && valor4 > valor2 && valor4 > valor3) {
        println("O $valor4 é o maior")
    } else if (valor4 == valor1 && valor4 == valor2 && valor4 == valor3) {
        println("Informe um valor diferente.")
    }

}