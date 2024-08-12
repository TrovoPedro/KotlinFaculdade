import java.util.Scanner

fun main() {
    val tecladoTexto = Scanner(System.`in`);
    val tecladoNum = Scanner(System.`in`);

    println("<----------Bem-Vindo---------->");
    println("Digite seu nome: ");
    val nome = tecladoTexto.nextLine();

    println("Informe sua idade: ");
    val idade = tecladoNum.nextInt();

    when{
        idade >= 16 -> println("$nome, você já pode votar!!");
        else -> print("$nome você ainda não pode votar, sua idade ainda é $idade!");
    }

}