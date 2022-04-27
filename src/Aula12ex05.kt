package br.com.catalisa.kotlin.conceitosBasicos

//5. Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.
fun main(){
    positivoOuNegativo()
}

fun positivoOuNegativo(){
    print("Digite um número positivo ou negativo:")
    val numeroInteiro = readln().toInt()
    if(numeroInteiro<0){
        print("O número digitado é negativo.")
    }else{
        print("O número digitado é positivo.")
    }
}