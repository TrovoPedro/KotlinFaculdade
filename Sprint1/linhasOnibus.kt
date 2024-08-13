import java.util.Scanner

fun main() {
    val nomeLinha = perguntarLinha("Informe o nome da linha: ");
    val menorTempo = perguntarTempo("Informe o menor tempo: ");
    val maiorTempo = perguntarTempo("Informe o maior tempo")
}

fun perguntarLinha(texto:String): String{
    val teclado = Scanner(System.`in`);
    println(texto);
    val nomeLinha = teclado.nextLine();

    return nomeLinha
}

fun perguntarTempo(tempo1:String): Double{
    val teclado = Scanner(System.`in`);
    println(tempo1);
    val menorTempo = teclado.nextDouble();

    println(tempo1);
    val maiorTempo = teclado.nextDouble();

    return menorTempo; maiorTempo
}

