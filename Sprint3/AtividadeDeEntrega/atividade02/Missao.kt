class Missao {
    var nome:String = ""
        private set

    var descricao:String = ""
        private set

    var nivelDificuldade: Int = 0
        private set

    var somaNivel:Int = 0

    fun setNome(novoValor:String){
        if(novoValor.length >= 3){
            this.nome = novoValor
        }
    }

    fun setDescricao(novoValor: String){
        if(novoValor.length >= 10){
            this.descricao = novoValor
        }
    }

    fun setNivelDificuldade(novoValor: Int){
        if(novoValor > 0){
            this.nivelDificuldade = novoValor
        }
        somaNivel += novoValor
    }
}