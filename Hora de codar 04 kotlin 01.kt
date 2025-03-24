fun main () {
    //6. Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.
    // ARRAY E BREAK

    var lista_de_nomes = arrayListOf<String>()
    var alunos = true


    println("Cadastro de estudantes.\n")


    while (alunos) {
        //para manter o loop enquanto os valores são informados infinitamente pelo usuario
        print("Nome: ")
        var nome = readln()
        lista_de_nomes.add(nome)

        if (nome == "pare") {
            alunos = false
        }

    }
    println("Quantidade de alunos: " + lista_de_nomes.size)
    println(lista_de_nomes)

    }

//array = uma variavel que guarda somente multiplos valores
