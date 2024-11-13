package Livraria

fun main() {
    val listaLivro = mutableListOf<Livro>()
    var livro = Livro()
    var autor = Autor()

    autor.nome = "Pedro"
    autor.idade = 19

    livro.titulo = "Não sei um nome"
    livro.anoPublicacao = 2005
    livro.autor = autor

    listaLivro.add(livro)

    listaLivro.forEach{it ->
        println("""
            Título do livro: ${livro.titulo}
            Ano: ${livro.anoPublicacao}
            Nome do autor: ${livro.autor.nome}
        """.trimIndent())
    }
}