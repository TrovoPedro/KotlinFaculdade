import java.text.DateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val bancoDeDados = mutableListOf<Produto>();

    println("<----- Bem vindo ao gerenciamento de produtos ----->");

    while (true) {
        println(
            """
            <---- Produtos ---->
            1 -> Adicionar produto.
            2 -> Buscar produto por indice (começa de 0).
            3 -> Remover produto por índice (começa de 0).
            4 -> Verificar validade por índice (começa de 0).
            5 -> Sair.
        """.trimIndent()
        )
        print("Digite a opção desejada: ");
        val opcao = readln().toInt();

        when (opcao) {
            1 -> {
                val novoProduto = Produto();
                println("Digite o nome do produto");
                novoProduto.nome = readln();

                println("Digite o preço");
                novoProduto.preco = readln().toDouble();

                println("Digite a data de validade dd/MM/yyyy");
                val dataTexto = readln();

                //Formatador da data
                val formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                //parse (texto que chegou, formatador indicando o jeito que veio);
                val dataFormatada = LocalDate.parse(dataTexto, formatadorData);
                novoProduto.validade = dataFormatada;

                bancoDeDados.add(novoProduto);
            }

            2 -> {
                print("Digite o produto que deseja listar: ");
                val index = readln().toInt();

                if (index >= 0 && index < bancoDeDados.size) {
                    val produtoEncontrado = bancoDeDados.get(index);
                    val formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    println("O produto ${produtoEncontrado.nome} custa R$${produtoEncontrado.preco} tem validade ${produtoEncontrado.validade.format(formatadorData)}\n");
                } else {
                    println("Produto não encontrado\n");
                }
            }

            3 -> {
                print("Digite o índice do produto que deseja remover: ")
                val index = readln().toInt();

                if (index >= 0 && index < bancoDeDados.size) {
                    bancoDeDados.removeAt(index);
                    print("Produto removido com sucesso!!\n");
                }else{
                    println("Produto não encontrado\n");
                }
            }

            4 -> {
                print("Digite o índice do produto que deseja ver a validade: ");
                val index = readln().toInt();

                if (index >= 0 && index < bancoDeDados.size) {
                    val produtoEncontrado = bancoDeDados[index]
                    print(produtoEncontrado.descrever());
                }else{
                    println("Produto não encontrado");
                }
            }
            5 -> break
            else -> println("Opção inválida");
        }
    }
}