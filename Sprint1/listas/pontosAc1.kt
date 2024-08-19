package listas

/*
*   Criar uma lista mutável vazia de tarefas.
    Adicionar tarefas à lista.
    Remover uma tarefa pela posição da lista.
    Exibir todas as tarefas da lista.
    Atualizar o nome de uma tarefa pela posição na lista.
    Exibir o número total de tarefas na lista.*/

fun main() {
    val listaTarefas = mutableListOf<String>();

    while (true){
        println("1- Adicionar tarefa");
        println("2- Remover tarefa");
        println("3- Exibir tarefas");
        println("4- Atualizar tarefa");
        println("5- Exibir total de tarefas");
        println("Sair");
        println("Digite uma opção: ");

        val opcao = readln().toInt();

        when(opcao){
            1 -> {
                print("Informe a tarefa: ");
                val nomeProduto = readln();
                listaTarefas.add(nomeProduto);
            }
            2 -> {
                println("Lista das tarefas: $listaTarefas");
                print("Informe a posição da tarefa que deseja excluir, começando do 0: ");
                val posicao = readln().toInt();
                if(posicao != -1){
                    listaTarefas.removeAt(posicao)
                }else{
                    print("Posição inválida!!");
                }
            }
            3 -> {
                println("Lista das tarefas: $listaTarefas");
            }
            4 -> {
                print("Informe o nome que deseja atualizar: ");
                val nomeAtualizar = readln();
                val posicaoElemento = listaTarefas.indexOf(nomeAtualizar);

                print("Informe o nome atualizado: ");
                val nomeAtualizado = readln();
                if(posicaoElemento != -1){
                    listaTarefas[posicaoElemento] = nomeAtualizado;
                }else{
                    print("Não existe essa tarefa na lista");
                }
            }
            5 -> {
                println("Você possui ${listaTarefas.size} tarefas na lista ");
            }
            6 -> break
            else -> print("Opção inválida");
        }
    }
}
