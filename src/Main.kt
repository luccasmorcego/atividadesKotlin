fun main() {
    val regex = Regex("^\\d+$")


    var num: String


    do {
        println("Digite um numero para iniciar a sequência de Fibonacci:")
        num = readln()
    } while (!regex.matches(num))


    fun calcFibonacci(n: Int): Int {
        if (n <= 1) {
            return n
        }
        return calcFibonacci(n - 1) + calcFibonacci(n - 2)
    }


    println("O valor na posição ${num.toInt()} da sequência de Fibonacci é: ${calcFibonacci(num.toInt())}")

}