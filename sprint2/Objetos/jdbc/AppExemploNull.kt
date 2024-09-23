fun main() {
    // o sinal de "?" faz com que a variavel possa receber um valor nulo

    val nome: String? = null

    // elvis operator "?:" como se fosse o if de uma linha so
    val resposta: String = nome ?: "Nome não definido"

    println(resposta)

    print("Digite seu email: ")
    var email: String = readlnOrNull() ?: "Não informado"
    println("Email: $email")

    print("Digite um número: ")
    var numero: Int = readln().toIntOrNull() ?: 0
    println("Número $numero")


    // musica é do tipo Musica mas no momento é "nada"
    val musica: Musica? = null

    if(musica != null){
        println("Nome da música ${musica.nome}")
        println("Produtor: ${musica.produtor ?: "Sem produtor"}")
    }else{
        println("Música não existe!!")
    }



    //Exemplo 2

    var resposta2 = ""

    if(nome != null){
        resposta2 = nome
    }else{
        resposta2 = "Nome não definido"
    }

    print(resposta2)
}