package SistemaEscolar

fun main() {

    var aluno = Aluno()
    var turma = Turma()

    aluno.nome = "Pedro"
    aluno.matricula = "03241006"

    turma.nome = "1SIS"
    turma.aluno.add(aluno)

    turma.aluno.forEach{it ->
        println("""
            Nome da Turma: ${turma.nome}
            Nome do aluno: ${aluno.nome}
            Matricula: ${aluno.matricula}
        """.trimIndent())
    }
}