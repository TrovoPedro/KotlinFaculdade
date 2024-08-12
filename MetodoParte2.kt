import java.util.Scanner

fun main() {
    for (i in 1..3){
        val nome = perguntarNome("Informe seu $i° nome: ");
        val idade = perguntarIdade("Informe sua $i° idade: ");
        exibirMensagemFinal(nome, idade)
    }
}

fun perguntarNome(texto:String): String {
    val teclado = Scanner(System.`in`);
    print(texto)
    val nome = teclado.nextLine();

    return nome;
}

fun perguntarIdade(texto: String): Int {
    val teclado = Scanner(System.`in`);
    print(texto)
    val idade = teclado.nextInt();

    return idade;
}

fun exibirMensagemFinal(nome:String, idade:Int){
    println("Olá $nome! Sua idade é $idade")
}
