package Agregacao

class Escola {
    var nome: String = ""
        private set

    val professores = mutableListOf<Professor>()

    fun setNome(novoNome: String){
        this.nome = novoNome;
    }

    fun getNome(): String{
        return nome
    }

    fun setProfessor(novoProfessor: Professor){
        professores.add(novoProfessor)
    }

    fun getProfessor():List<Professor>{
        return professores
    }

}