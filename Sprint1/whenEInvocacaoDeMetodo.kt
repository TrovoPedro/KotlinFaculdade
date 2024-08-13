import java.util.Scanner

fun main() {
    val altura = perguntarAltura("Informe sua altura: ");
    exibirMensagem(altura);
}

fun perguntarAltura(texto:String): Double{
    val teclado = Scanner(System.`in`);
    println(texto);
    val altura = teclado.nextDouble();

    return altura;
}

fun exibirMensagem(altura:Double){
    when{
        altura < 1.8 -> println("Você não pode jogar basquete!");
        else -> println("Você pode jogar basquete");
    }
}