fun main() {
    val musicaRepositorio = MusicaRepositorio()
    musicaRepositorio.configurar()

    musicaRepositorio.criarTabela()

    val novaMusica = Musica()
    novaMusica.nome = "Não é só pepeca que tem mal"
    novaMusica.banda = "O boy da seresta"
    novaMusica.produtor = "DJ Azeitona"

    //Retorna true ou false
    val sucesso = musicaRepositorio.inserir(novaMusica)

    if (sucesso) {
        println("Inserido com sucesso")
    } else {
        println("Deu ruim!!");
    }

    val listaMusicas = musicaRepositorio.listar()
    listaMusicas.forEach {
        println(
            """
            ID: ${it.id}
            Nome: ${it.nome}
            Banda: ${it.banda}
            Produtor: ${it.produtor}
        """
        )
    }

    val idParaBusca = 1

    if(musicaRepositorio.existePorId(idParaBusca)){
        val musicaEncontrada = musicaRepositorio.buscaPorId(idParaBusca)
        println("Nome: ${musicaEncontrada.nome}")
    }else{
        println("Música não encontrada")
    }

    musicaRepositorio.inserir(
        Musica(nome = "Lepo Lepo", banda = "Calcinha preta", produtor = "Joelma")
    )

    if(musicaRepositorio.existePorId(idParaBusca)){
        val deletado = musicaRepositorio.deletaPorId(idParaBusca)
    }else{
        println("Música não existe")
    }

    if(musicaRepositorio.existePorId(2)){
        val musicaAtualizada = Musica(
            nome = "Californication",
            banda = "RHCP",
            produtor = "Na california"
        )
        val atualizado = musicaRepositorio.atualizaPorId(2, musicaAtualizada)
        println(if(atualizado) "Atualizado!" else "Deu ruim")
    }else{
        println("Música não existe")
    }
}