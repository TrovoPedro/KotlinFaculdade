package parte2

fun main() {

    val pessoa = Pessoa()
    pessoa.nome = "John Doe"

    println(pessoa.nome)
    println(pessoa.andar())

    println("<-----Aluno----->")
    val aluno = Aluno()
    aluno.nome = "Pedro"
    println(aluno.nome)
    println(aluno.andar())

    aluno.ra = "10101010"
    println(aluno.estudar())

    println("<----Professor----->")
    val professor = Professor()
    professor.nome = "Cardoso Gay"
    println(professor.nome)
    println(professor.andar())

    professor.lattes = "1101001"
    println(professor.prepararProva())

}