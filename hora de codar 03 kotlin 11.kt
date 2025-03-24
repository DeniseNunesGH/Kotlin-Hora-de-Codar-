fun main () {
    //11.
    print("Escreva um número: ")
    var n = readln().toInt()

    var a = 1
    var b = 1
    var conta = 0

    while (!(a > n || b > 10)){
        conta = a * b
        print("$conta")
        b++
    }
    b = 1
    a++
}