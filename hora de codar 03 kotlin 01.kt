fun main () {
    //1.
    print("BOMBA RELÓGIO!! Contagem regressiva... \n\n")
    var contagem = 30

    while (contagem >= 0) {
        //enquanto contagem for maior ou igual a zero, ele continuará contando
        when (contagem) {
            //o loop when verifica o valor de contagem
            0 -> print("BOOM!")
            //quando contagem = 0, irá explodir
            else -> println(contagem)
            //enquanto não chegar em 0, irá contar até chegar
        }
        contagem--
        //aqui tira um número da contagem sempre que contar, ficará menor o valor CONTAGEM até virar zero
    }

}