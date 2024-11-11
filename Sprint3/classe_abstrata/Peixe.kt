package classe_abstrata

class Peixe: Animal(){
    fun nadar(){
        println("Nadando...")
    }

    override fun respirar() {
        println("Peixe está morrendo afogado, mas está respirando.")
    }

    override fun comer() {
        println("Peixe está sugando um alimento.")
    }

    override fun nascer() {
        println("Saindo de uma ova.")
    }
}