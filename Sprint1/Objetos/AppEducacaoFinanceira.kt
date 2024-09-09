import java.util.Scanner

fun main() {
    val cofrinho = Cofrinho();
    var teclado = Scanner(System.`in`);
    var tecladoDouble = Scanner(System.`in`)

    println("<-----Seja bem vindo----->");
    print("Informe o objetivo da sua meta: ");
    cofrinho.objetivo = teclado.nextLine();

    print("Informe o valor da sua meta: ");
    cofrinho.meta = tecladoDouble.nextDouble();

    while (true){
        println("------- Cofrinho -------");
        println("""
            1 - Depositar no cofre.
            2 - Retirar do cofre.
            3 - Detalhes.
            4 - Ver número de depósitos
            5 - Sair.
        """.trimIndent());
        var opcaoEscolhida = teclado.next();

        when(opcaoEscolhida.toInt()){
            1 -> {
                print("Informe o valor a ser depositado: ");
                var valorDepositado = teclado.nextDouble();
                cofrinho.depositar(valorDepositado);
            }
            2 -> {
                print("Informe o valor a ser retirado: ");
                var valorRetirado = teclado.nextDouble();
                cofrinho.retirar(valorRetirado);
            }
            3 -> {
                print(cofrinho.descrever());
            }
            4 -> {
                print("Até agora você fez ${cofrinho.depositos} depósitos!!\n")
            }
            5 -> break;
            else -> println("Opção inválida!!");
        }
    }

}