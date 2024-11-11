package `interface`

class Atacante : JogadorFutebol, Pessoa(){
    override fun correr() {
        println("Correndo")
    }

    override fun chutar() {
        println("${nome} DE BICICLETA MINHA NOOOOOSSAAAAAA.......")
    }

    override fun cair() {
       println("Foi falta")
    }

    override fun pegarComMao() {
        println("Falta pra amarelo")
    }

    override fun coletiva(texto: String): String {
        return "Atacante falando na coletiva: $texto"
    }
}