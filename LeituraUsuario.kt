import java.util.Scanner

fun main() {
    val tecladoString = Scanner(System.`in`);
    val tecladoInt = Scanner(System.`in`);

    var nome = "";
    var idade = 0;
    var cidade = "";
    var renda = 0;

    print("Digite seu nome: ");
    nome = tecladoString.nextLine()

    println("Seu nome é $nome")

    print("Informe sua idade: ")
    idade = tecladoInt.nextInt()

    println("Sua idade é: $idade")

    print("Informe sua cidade: ")
    cidade = tecladoString.nextLine()

    println("Sua cidade é: $cidade")

    print("Informe sua renda: ")
    renda = tecladoInt.nextInt()

    println("Sua renda é: $renda")

    
}