package br.com.catalisa.kotlin.conceitosBasicos

//9. Crie um algoritmo que leia uma frase do usuário e escreva na tela exatamente o que o usuário digitar.
fun main(){
    fraseDigitada()
}

fun fraseDigitada(){
    print("Digite uma frase: ")
    var frase = readln()
    print(frase)
}