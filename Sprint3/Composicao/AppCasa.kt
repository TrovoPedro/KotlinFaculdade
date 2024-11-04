package Composicao

fun main() {
    val casa = Casa()
    val quarto = Quarto()
    quarto.metrosQuad = 15.0

    casa.setQuarto(quarto)

    casa.getQuarto().forEach{
        println(quarto.metrosQuad)
    }
}