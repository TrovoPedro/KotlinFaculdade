import java.util.Scanner

fun main() {
    val pedidoPizza = PedidoPizza();
    val teclado = Scanner(System.`in`);

    println("<-----Seja bem-vindo----->");

    println("Informe o sabor da sua pizza: ");
    pedidoPizza.sabor = teclado.next();

    print("Informe o preço da pizza: ");
    pedidoPizza.preco = teclado.nextDouble();

    println("Informe a quantidade de amigos para dividir o preço: ");
    pedidoPizza.quantidadeAmigos = teclado.nextInt();

    println("Informe um cupom: ");
    var cupom:String = teclado.next();
    pedidoPizza.validarCupom(cupom);

    println(pedidoPizza.descrever());

    println("Cada amigo vai pagar R$${pedidoPizza.obterValorPorAmigo()}");
    println("Cupons usados até agora: ")
    println(pedidoPizza.obterCuponsUsados());
}