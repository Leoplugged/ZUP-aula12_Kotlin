package br.com.catalisa.kotlin.conceitosBasicos

//3. Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
fun main() {
    multiploCinco()
}

fun multiploCinco() {
    print("Digite um número qualquer para checar se é múltiplo de 5: ")
    val numero = readln().toInt()
    if (numero % 5 == 0)
        println("O número $numero é múltiplo de 5!")
    else
        println("O número $numero NÃO é múltiplo de 5!")
}