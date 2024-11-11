package classe_abstrata

fun main() {
    val cachorro = Cachorro()
    val peixe = Peixe()

    cachorro.nome = "Doguinho"

    cachorro.nascer()
    cachorro.respirar()
    cachorro.latir()
    cachorro.comer()

    peixe.nome = "Jilmar"

    peixe.nascer()
    peixe.respirar()
    peixe.nadar()
    peixe.comer()
}