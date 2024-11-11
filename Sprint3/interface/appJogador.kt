package `interface`

fun main() {
    val atacante = Atacante()

    atacante.nome = "Caça Rato"

    atacante.correr()
    atacante.chutar()
    atacante.cair()
    atacante.pegarComMao()
    println(atacante.coletiva("Agradecer a Deus pelos 3 pontos, agora é focar no próximo jogo"))

    println("<------------------>")

    val goleiro = Goleiro()

    goleiro.nome = "Jacinto"

    goleiro.correr()
    goleiro.chutar()
    goleiro.cair()
    goleiro.pegarComMao()
    println(goleiro.coletiva("Infelizmente franguei né, acontece. Agora é focar no próximo jogo e buscar os 3 pontos."))
}