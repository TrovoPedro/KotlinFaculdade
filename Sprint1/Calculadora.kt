import java.util.Scanner

fun main() {
    val teclado = Scanner(System.`in`);
    val listaOpcao = arrayOf("Somar", "Subtrair", "Multiplicar", "Dividir");
    var n1:Int = 0;
    var n2:Int = 0;
    var operacao:String = "";

    println("<----------Seja bem-vindo---------->");
    println("Qual operação você deseja fazer?");
    println("1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir");
    operacao = teclado.next();

    println("Informe o primeiro número: ");
    n1 = teclado.nextInt()

    println("Informe o segundo número: ");
    n2 = teclado.nextInt()

    if (operacao == listaOpcao[0] || operacao == "1"){
        somar(n1, n2);
    }else if(operacao == listaOpcao[1] || operacao == "2"){
        subtrair(n1, n2);
    }else if (operacao == listaOpcao[2] || operacao == "3"){
        multiplicar(n1, n2);
    }else{
        dividir(n1, n2);
    }
}

fun somar(n1: Int, n2: Int) {
    var resultado = n1 + n2;
    print("A soma do seus dois números deu: $resultado");
}

fun subtrair(n1: Int, n2: Int){
    var resultado = n1 - n2;
    print("A subtração do seus dois números deu: $resultado");
}

fun multiplicar(n1: Int, n2: Int){
    var resultado = n1 * n2;
    print("A multiplicação do seus dois números deu: $resultado");
}

fun dividir(n1: Int, n2: Int){
    var resultado = n1 / n2;
    print("A divisão do seus dois números deu: $resultado")
}