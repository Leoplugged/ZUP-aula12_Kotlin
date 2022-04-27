package br.com.catalisa.kotlin.conceitosBasicos

/*4. Crie um algoritmo que, dada uma temperatura em graus célsius, exiba uma mensagem informando o tipo do clima, de acordo com as seguintes condições:
a. se a temperatura estiver até 18 graus, o clima é frio;
b. se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
c. se a temperatura estiver entre 24 e 35 graus, o clima é quente;
d. se a temperatura estiver acima de 35 graus, o clima é muito quente.*/
fun main() {
    realFeel()
}

fun realFeel() {
    print("Qual a temperatura em graus Célsius você deseja saber para verificar o tipo do clima? ")
    val temperatura = readln().toDouble()
    if(temperatura <= 18.9){
        println("O clima é frio.")
    }else if(temperatura in 19.0 .. 23.9){
        println("O clima é agradável.")
    }else if(temperatura in 24.0..35.0){
        println("O clima é quente.")
    }else if(temperatura >= 35.1) {
        println("O clima é muito quente.")
    }
}