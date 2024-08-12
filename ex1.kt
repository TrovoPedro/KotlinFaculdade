import java.util.Scanner

fun main() {
    val tecladoTexto = Scanner(System.`in`);
    val tecladoNum = Scanner(System.`in`);

    println("<----------Bem-Vindo---------->");
    println("Informe seu nome: ");
    val nome:String = tecladoTexto.nextLine();

    println("Informe seu peso: ");
    val peso:Double = tecladoNum.nextDouble();

    println("Informe sua altura: ");
    val altura:Double = tecladoNum.nextDouble();

    val resultado:Double = peso / (altura * altura);

    print("Olá $nome! Seu IMC é de ${"%.2f".format(resultado)}");
}