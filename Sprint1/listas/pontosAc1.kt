package listas

import kotlin.system.exitProcess

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
                val nomeTarefa = readln();
                if(listaTarefas.contains(nomeTarefa)){
                    println("A tarefa já está na lista!!");
                }else{
                    listaTarefas.add(nomeTarefa);
                    Thread.sleep(2000);
                    println("Produto cadastrado com sucesso!!");
                }
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
                for (i in 0..listaTarefas.size) {
                    println("<----------Lista das tarefas---------->");
                    println("Produto ${i + 1} - ${listaTarefas[i]}")
                }

                /*for (elem in listaTarefas) {
                    println("Lista das tarefas: ${elem}"); // outra maneira de fazer o for
                }*/

                // listaTarefas.forEachIndexed(i, item -> prinln("Produto ${i + 1} - ${item}")) forEach no kotlin (melhor)
            }
            4 -> {
                print("Informe o nome que deseja atualizar: ");
                val nomeAtualizar = readln();
                val posicaoElemento = listaTarefas.indexOf(nomeAtualizar);

                print("Informe o novo nome: ");
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
