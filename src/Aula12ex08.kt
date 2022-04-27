package br.com.catalisa.kotlin.conceitosBasicos

//8. Crie um algoritmo que leia as variáveis inteiras x e y e troque o valor destas variáveis. Isto é, x deve ficar com o valor de y e y deve ficar com o valor de x. Mostre os valores depois da troca.
fun main(){
    trocadorValores()
}

fun trocadorValores(){
    println("Defina um valor x e, em seguida, y: ")
    var x = readln().toInt()
    var y = readln().toInt()
    println("Valores definidos: x = $x e y = $y. \nIniciando operação de troca. ")
    var z = 0
    z = x
    x = y
    y = z
    print("Valores trocados: x = $x e y = $y.")
}