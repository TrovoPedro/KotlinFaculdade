import java.util.Scanner
import kotlin.math.pow

fun main() {

    val soma = 10 + 10;
    val sub = 10 - 5;
    val divisao = 10 / 2;
    val multi = 10 * 2;
    val potencia:Double = 3.3.pow(2); // tipo declarativo // o metedo "pow" serve para fazer potenciação
    //val potencia = 5.0 * 5.0 // tipo inferido


    println("Soma $soma");
    println("Soma ${10 + 10}"); // as chaves usamos para fazer operações ou acessar metodos de uma variavel
    println("subtração $sub");
    println("Divisão $divisao");
    println("Multiplicação $multi");
    println("Potencia ${"%.2f".format(potencia)}"); //formatação da variavel

    val tecladoTexto = Scanner(System.`in`);
    val tecladoNum = Scanner(System.`in`);

    println("Digite seu nome: ");
    val nome = tecladoTexto.nextLine();

    println("Bem vindo $nome");

    println("Digite um número: ");
    val numero = tecladoNum.nextInt();

    when(numero){ //novo when
        1 -> println("É 1");
        2 -> println("É 2");
        3 -> println("É 3");
        in 4..6 -> println("É do número 4 ao 6");
        7,8,9 -> println("É 7, 8 ou 9");
        else -> println("Número inválido");
    }

    when { // when antigo
        numero == 1 -> println("É 1");
        numero in 4..6 -> println("É do número 4 ao 6");
        numero > 6 -> println("É maior que 6");
    }
}
