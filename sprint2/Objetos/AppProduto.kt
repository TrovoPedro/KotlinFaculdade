package sprint2.Objetos

import Produto

fun main() {
    val produto = Produto()

    print("Informe o nome do produto: ");
    produto.nome = readln();

    print("Informe o preço do produto: ");
    produto.preco = readln().toDouble();

    print("É brinde? 1 - É brinde / 2 - Não é brinde: ");
    var respostaBrinde = readln().toInt();

    if(respostaBrinde == 1){
        produto.brinde = true;
    }

    println("O produto ${produto.nome} custa R$${"%.2f".format(produto.preco)}")
}