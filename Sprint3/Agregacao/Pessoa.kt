package Agregacao

open class Pessoa {
    var nome: String = ""
        private set

    var cpf: String = ""
        private set

    fun apresentar(): String{
        return "Olá, eu sou $nome"
    }

    fun setNome(novoValor:String){
        if(novoValor.length >= 2){
            this.nome = novoValor
        }
    }

    fun setCpf(novoValor:String){
        if(novoValor.length == 11){
            this.cpf = novoValor
        }
    }
}