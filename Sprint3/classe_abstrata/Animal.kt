package classe_abstrata

// classe abstrata é "open" por default
abstract class Animal {
    var nome: String = ""

    open fun respirar(){
        println("Animal está respirando.")
    }

    abstract fun comer()

    abstract fun nascer()
}

