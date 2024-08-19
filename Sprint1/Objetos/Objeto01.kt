fun main() {

    val pessoa1 = Pessoa("Pedro", 19); //pessoa1 é uma instancia de Pessoa
    val pessoa2 = Pessoa("Trovo", 19);

    println("Pessoa 1- ${pessoa1.nome}");
    println("Pessoa 1- ${pessoa1.idade}");

    val pessoas = mutableListOf<Pessoa>();
    pessoas.add(pessoa1);
    pessoas.add(pessoa2);

    for (pessoaDaVez in pessoas){
        println("A pessoa da vez é: ${pessoaDaVez.nome} com idade de ${pessoaDaVez.idade}");
    }

    pessoa1.respirar();
    pessoa2.respirar();

    pessoa1.ola();
    pessoa2.ola();
}