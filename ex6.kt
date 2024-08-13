import java.util.Scanner

fun main() {
    val nomeLinha = perguntarLinha("Informe o nome da linha: ");
    val menorTempo = perguntarTempo("Informe o menor tempo: ");
    val maiorTempo = perguntarTempoMaior("Informe o maior tempo: ");
    exibirMensagem(nomeLinha, menorTempo, maiorTempo)
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

    return menorTempo;
}

fun perguntarTempoMaior(tempo: String): Double{
    val teclado = Scanner(System.`in`);
    println(tempo);
    val maiorTempo = teclado.nextDouble();

    return maiorTempo;
}

fun exibirMensagem(nomeLinha:String, menorTempo:Double, maiorTempo:Double){
    val resultado = (menorTempo + maiorTempo) / 2;
    print(resultado);
}


