import java.util.Scanner

fun main() {

    val nome = pergunta("Informe seu nome: ");
    val bairro = pergunta("Informe seu bairro: ");
    mostrarMsgFinal(nome, bairro);

}

fun pergunta(texto:String): String {
    val teclado = Scanner(System.`in`);
    print(texto);

    val nome = teclado.nextLine();
    val bairro = teclado.nextLine();

    return nome; bairro;
}

fun mostrarMsgFinal(nome:String, bairro:String){
    println("Você se chama $nome e mora no bairro $bairro");
}