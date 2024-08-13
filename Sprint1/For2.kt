import java.util.Scanner

fun main() {
    val frase = pensamentoPositivo("Digite sua frase positva: ");
    val qtdFrase = quantidadeRepeticao("Informe a quantidade de vezes para repetir a frase: ");
    exibirMensagem(frase, qtdFrase);
}

fun pensamentoPositivo(texto:String): String{
    val teclado = Scanner(System.`in`);
    println(texto);
    val frase = teclado.nextLine();

    return frase
}

fun quantidadeRepeticao(texto:String): Int{
    val teclado = Scanner(System.`in`);
    println(texto);
    val qtdFrase = teclado.nextInt();

    return qtdFrase
}

fun exibirMensagem(frase:String, qtdFrase:Int){
    for (i in 1..qtdFrase){
        println(frase);
    }
}