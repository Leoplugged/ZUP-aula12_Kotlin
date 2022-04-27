package br.com.catalisa.kotlin.conceitosBasicos

//2. Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
fun main() {
    diasVividos()
}
fun diasVividos() {
    print("Quantos anos tem a pessoa? ")
    val idade = readln().toInt()
    println("A pessoa viveu ${idade*365} dias.")
}