package br.com.catalisa.kotlin.conceitosBasicos
import java.text.DecimalFormat

//6. Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere a cotação do dolar atual.
fun main(){
    conversorUsdBrl()
}

fun conversorUsdBrl(){
    print("Digite um valor em dólar para converter em real: USD ")
    val valor = readln().toDouble()
    val decimal = DecimalFormat("#,###.00")
    print("O valor em real é BRL ${decimal.format(valor*4.60)}.")
}