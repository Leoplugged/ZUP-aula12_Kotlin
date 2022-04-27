package br.com.catalisa.kotlin.conceitosBasicos

//7. Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
fun main(){
    areaRetangulo()
}

fun areaRetangulo(){
    print("Algoritmo para calcular a área do retângulo.\nDigite a dimensão da base em cm: ")
    val base = readln().toInt()
    print("Agora, digite a dimensão da altura em cm: ")
    val altura = readln().toInt()
    print("A área do retângulo é de ${base*altura} cm².")
}