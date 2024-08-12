import java.util.Scanner

fun main() {
    val tecladoNum = Scanner(System.`in`);
    val tecladoTexto = Scanner(System.`in`)

    println("<----------Bem-Vindo---------->");

    println("Informe o nome do atacante: ");
    val nome = tecladoTexto.nextLine();

    println("Informe a quantidade de gols que o atacante $nome tem");
    val qtdGol = tecladoNum.nextInt();

    when{
        qtdGol <= 0 -> println("$nome, sem pontaria.");
        qtdGol in 1..2 -> println("$nome, pontaria meia boca.");
        qtdGol in 3..5  -> print("$nome, dá pro gasto");
        else
    }
}