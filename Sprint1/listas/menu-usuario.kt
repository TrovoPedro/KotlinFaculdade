fun main() {
    val produtos = mutableListOf<String>();

    while (true){
        println("<----------Bem vindo, escolha uma opção---------->")
        println("1 - Adicionar novo produto: ");
        println("2 - Remover produto: ");
        println("3 - Atualizar produto: ");
        println("4 - Todos os produtos: ");
        println("5 - Sair");
        println("Digite a opção: ");

        val opcaoEscolhida = readln().toInt();

        when(opcaoEscolhida){
            1 -> {
                print("Digite o nome do produto: ")
                val novoProduto = readln(); //readln() le o que o usuario digitou igual ao Scanner
                produtos.add(novoProduto);
            }
            2 -> {
                println("Produtos: $produtos")
                print("Digite a posição do produto a ser removido: ");
                val posicao = readln().toInt();
                if(produtos.indices.contains(posicao)){
                    produtos.removeAt(posicao);
                }else{
                    print("Posição inválida!!");
                }
            }
            3 -> {
                print("Em manutenção");
            }
            4 -> {
                println("Produtos: $produtos");
            }
            5 -> break
            else -> println("Opção inválida!!");
        }
        Thread.sleep(3000);
    }

}