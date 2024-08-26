fun main() {
    val carro = Carro( // Construtor
        "Volvo",
        "XC5",
        ligado = false)
    /*
        é possível reatribuir valores iniciais
        sem se preocupar com a ordem (basta passar o nome)
    */

    println("Estado do carro: ligado: ${carro.ligado}");
    carro.ligar();
    println("Estado do carro: ligado: ${carro.ligado}");

    /*
        val carro = instancia do objeto Carro, Carro = planta do predio instancia = "predio construido
    */

    println("Desligando carro...");
    carro.desligar();
    println("Carro ligado? ${carro.ligado}");

    carro.ligar();
    carro.acelerar();
    carro.acelerar();
    carro.acelerar();
    carro.frear();

    print(carro.descricao());

    carro.frear(); // velociade = 10
    carro.frear();// velocidade= 0
    carro.frear(); // mantem a velocidade em 0 por conta da validação no metodo da classe
    println("\nVelocidade: ${carro.velocidade}");

    // exemplo do carro desligado
    carro.desligar();
    println(carro.descricao());
    carro.acelerar();
    carro.acelerar();
    println();
    println(carro.descricao());

    println("\n ${carro.caixaPreta()}");

    carro.exibirVelocidadeComTexto("Esse carro está á ${carro.velocidade}km/h!!")

}