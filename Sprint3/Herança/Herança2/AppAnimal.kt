package part3

fun main() {
    val animal = Animal()
    animal.nome = "Desconhecido"
    println(animal.reproduzirSom())

    println("----- Cachorro -----")
    val cachorro = Cachorro()
    cachorro.nome = "Marley"
    println(cachorro.nome)
    println(cachorro.reproduzirSom())

    println("----- Gato -----")
    val gato = Gato()
    gato.nome = "De Botas"
    println(gato.nome)
    println(gato.reproduzirSom())
}