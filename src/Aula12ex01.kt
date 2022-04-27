package br.com.catalisa.kotlin.conceitosBasicos

//1. Crie um algoritmo que leia um número inteiro e mostre seu antecessor.
fun main() {
    antecessor()
}

fun antecessor() {
    print("Digite um valor inteiro para que seu antecessor seja mostrado:")
    val numeroInteiro = readln().toInt()
    print("O número inteiro $numeroInteiro tem ${numeroInteiro - 1} como seu antecessor.")
}