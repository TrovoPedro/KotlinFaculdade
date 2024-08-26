class Carro( // Caso precise construir um objeto vazio, atribua valores iniciais aqui.
    var marca: String,
    var modelo: String,
    var velocidade: Int = 0,
    var ligado: Boolean = false
) {

    val historicoDeAcao = mutableListOf<String>()

    fun ligar() {
        ligado = true;
        historicoDeAcao.add("Ligou o carro.");
    }

    fun desligar() {
        ligado = false;
        historicoDeAcao.add("Desligou o carro.");
    }

    fun acelerar() {
        if (ligado) { // verificando se o carro está ligado para acelerar
            velocidade += 10;

            if (velocidade >= 120) {
                velocidade = 120;
            }
            historicoDeAcao.add("Acelerou o carro.");
        }

    }

    fun frear() {
        if (ligado) { // verificando se o carro está ligado para frear
            velocidade -= 10;

            if (velocidade <= 0) {
                velocidade = 0;
            }
            historicoDeAcao.add("Freou o carro.");
        }
    }

    fun descricao(): String {
        val textoLigado = if (ligado) {
            "Ligado";
        } else {
            "Desligado"
        }

        return """
            Marca: $marca;
            Modelo: $modelo;
            Ligado: $textoLigado;
            Velocidade: $velocidade;
        """.trimIndent(); // trim faz a identação da String tirando os espaços da direita e esquerda
    }

    fun caixaPreta():String{
        var acoes = "";

        for(acaoDaVez in historicoDeAcao){
            acoes += "\n - $acaoDaVez";
        }

        return acoes;
    }

    fun exibirVelocidadeComTexto(texto:String){
        println("Texto Dinâmico da Velocidae: ${texto}");
    }

}

print("Hora formatada ${"%02d".format(hora)}")
