import java.util.Scanner

//solid = responsabilidade unica -> single responsability,

fun main() {

    val nome = pergunta("Digite o primeiro nome: ");
    val nome2 = pergunta("Digite o segundo nome: ");
    exibirMensagemFinal(nome, nome2);

}

fun pergunta(texto:String): String { // dentro dos parenteses estamos recebendo o "argumento"

    val teclado = Scanner(System.`in`);
    print(texto);
    val nome = teclado.nextLine();

    return nome;

}

fun exibirMensagemFinal(nome:String, nome2:String){

    println("Bem vindo $nome e $nome2")

}
