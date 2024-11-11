class Explorador: Aventureiro() {
    var nivelExperiencia:Int = 0
        private set
    var missoes = mutableListOf<Missao>()
        private set

    var missaoNivel = Missao()

    fun inscreverEmMissao(missao: Missao){
        missoes.add(missao)
    }

    fun listarMissoes():List<Missao>{
        if(missoes.size > 0){
            return missoes
        }
        return missoes
    }

    fun abandonarMissao(nomeMissao: String){
        missoes.removeIf{it.nome == nomeMissao}
    }

    fun ganharExperiencia(pontos:Int){
        nivelExperiencia += pontos
    }

    fun dificuldadeMediaMissoes():Int{
        if(missoes.size > 0){
            var media: Int =  missaoNivel.somaNivel / missoes.size
            return media
        }
        return 0
    }

}