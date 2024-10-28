package parte1

fun main() {
    val tarefa = Tarefa()

    tarefa.nome = "Dar banho no peixe"
    tarefa.pontuacao = 8
    tarefa.status = StatusEnum.PENDENTE

    println(tarefa.status.nomeComleto)
    println("Vou iniciar o banho...")

    tarefa.status = StatusEnum.EM_ANDAMENTO
    print(tarefa.status.nomeComleto)

    if(tarefa.status.equals(StatusEnum.PENDENTE)){
        println("Tarefa pendente")
    } else if(tarefa.status.equals((StatusEnum.EM_ANDAMENTO))){
        println("Tarefa em andamento")
    } else{
        println("Tarefa concluída")
    }

}