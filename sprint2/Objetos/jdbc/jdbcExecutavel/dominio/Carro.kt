package dominio

import javax.swing.text.StyledEditorKit.BoldAction

class Carro {

    var id: Int = 0
    var nome: String = ""
        private set

    var vendido: Boolean = false
        private set

    fun setNome(novoValor: String){
        if(novoValor.length >= 3){
            nome = novoValor
        }
    }

    fun setVendido(novoValor: Boolean){
        vendido = novoValor
    }
}