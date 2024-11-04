package Agregacao

fun main() {
    val professor = Professor()
    professor.lattes = "12321"

    val escola = Escola()
    escola.setNome("SPTECH")

    escola.setProfessor(professor)

    print(escola.getNome())
    print(escola.getProfessor())

}