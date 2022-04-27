package br.com.catalisa.kotlin.conceitosBasicos

//10. Crie um algoritmo que leia um número inteiro e mostre seu sucessor.
fun main(){
    sucessor()
}

fun sucessor() {
    print("Digite um valor inteiro para que seu sucessor seja mostrado:")
    val numeroInteiro = readln().toInt()
    print("O número inteiro $numeroInteiro tem ${numeroInteiro + 1} como seu sucessor.")
}