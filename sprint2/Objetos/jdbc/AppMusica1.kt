import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

fun main() {
    //CONEXÃO INICIAL DO BANCO DE DADOS

    val datasource = BasicDataSource()
    datasource.driverClassName = "org.h2.Driver"
    datasource.url = "jdbc:h2:mem:festival"
    datasource.username = "trovo"
    datasource.password = ""

    // CRIANDO UM TEMPLATE DE "datasource"
    val jdbcTemplate = JdbcTemplate(datasource)

    jdbcTemplate.execute("""
        CREATE TABLE Musica(
            id int PRIMARY KEY AUTO_INCREMENT,
            nome varchar(255) NOT NULL,
            banda varchar(255) NOT NULL,
            produtor varchar(255)
        )
    """.trimIndent())

    jdbcTemplate.update("INSERT INTO Musica (nome, banda, produtor) " +
            "VALUES ('Numb', 'Linkn Park', 'Sei não')"
    )

    jdbcTemplate.update("INSERT INTO Musica (nome, banda, produtor) " +
            "VALUES ('Não é só pepeca que tem mel', 'O boy da seresta', 'Sei não')"
    )

    val listaMusicas: List<Musica> = jdbcTemplate.query( // "query" retorna uma lista
        "SELECT * FROM Musica",
        BeanPropertyRowMapper(Musica::class.java) // Pega todas as linhas, mapeia e adiciona à "Musica"
    )

    val musicaId = 1
    val existeMusica: Boolean = jdbcTemplate.queryForObject(
        "SELECT COUNT(*) FROM Musica WHERE id = ?",
        Int::class.java,
        musicaId
    ) > 0

    if(existeMusica){
        val musicaEncontrada = jdbcTemplate.queryForObject(
            "SELECT * FROM Musica WHERE id = ?",
            BeanPropertyRowMapper(Musica::class.java),
            musicaId
        )

        println("""
            <----Música por ID---->
            ID: ${musicaEncontrada.id}
            Nome: ${musicaEncontrada.nome}
            
        """.trimIndent() + "\n")
    }else{
        print("Música não encontrada")
    }

    listaMusicas.forEach{// percorrendo a lista, o "it" referencia o valor da vez
        println("""
            <----Exibindo todas as músicas---->
            ID: ${it.id}
            Nome: ${it.nome}
            Banda: ${it.banda}
            Produtor: ${it.produtor} 
        """.trimIndent() + "\n")
    }

    // dicas

    /*val listaFiltrada = listaMusicas.filter { musica -> musica.nome.length > 3}

    listaFiltrada.forEach{// percorrendo a lista, o "it" referencia o valor da vez
        println("""
            ID: ${it.id}
            Nome: ${it.nome}
            Banda: ${it.banda}
            Produtor: ${it.produtor}
        """.trimIndent())
    }*/
}

