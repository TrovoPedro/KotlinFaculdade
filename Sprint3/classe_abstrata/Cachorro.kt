package classe_abstrata

class Cachorro: Animal() {

    fun latir(){
        println("${nome} está latindo.")
    }

    override fun comer(){
        println("Cachorro ${nome} está comendo.");
    }

    override fun nascer() {
        println("Sendo parido.")
    }
}