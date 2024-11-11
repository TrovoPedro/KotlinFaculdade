package `interface`

class Goleiro : JogadorFutebol, Pessoa(){

    override fun correr() {
        println("Correndo...")
    }

    override fun chutar() {
        println("Tiro de meta")
    }

    override fun cair() {
        println("Caindo...")
    }

    override fun pegarComMao() {
        println("Agarrei a bola com as mãos")
    }

    override fun coletiva(texto: String): String {
        return "Goleiro falando na coletiva: $texto"
    }

}