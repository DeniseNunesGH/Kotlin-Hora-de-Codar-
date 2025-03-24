fun main () {

    var contador = 0
    var dentro = 0
    var fora = 0

    while (contador <= 9) {
        print("Informe um valor: ")
        var num = readln().toInt()
        if (num >= 24 && num <= 42){
            dentro++
        }else {
            fora++
        }
        contador++
    }

    print("A quantidade de números entre 24 e 42 são $dentro \n")
    print("A quantidade de números fora deste intervalo são $fora .")
}
