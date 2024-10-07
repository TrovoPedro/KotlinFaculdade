import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class FilmeRepositorio {

    lateinit var jdbcTemplate: JdbcTemplate

    fun configurar() {
        val dataSource = BasicDataSource()
        dataSource.driverClassName = "org.h2.Driver"
        dataSource.url = "jdbc:h2:mem:locadora"
        dataSource.username = "sa"
        dataSource.password = ""

        jdbcTemplate = JdbcTemplate(dataSource);
    }

    fun criarTabela(){
        jdbcTemplate.execute("""
            create table filme(
                id int primary key auto_increment,
                nome varchar(255),
                genero varchar(255),
                anoLancamento int,
                duracao int,
                alugado boolean
            );
        """.trimIndent())
    }

    fun inserir(novoFilme: Filme): Boolean{
        val qtdLinhasInseridas = jdbcTemplate.update("""
            insert into filme (nome, genero, anoLancamento, duracao, alugado) 
            values (?, ?, ?, ?, false)
        """, novoFilme.nome,
            novoFilme.genero,
            novoFilme.anoLancamento,
            novoFilme.duracao)

        return qtdLinhasInseridas > 0
    }

    fun listar(): List<Filme>{

        return jdbcTemplate.query(
            "select * from filme",
            BeanPropertyRowMapper(Filme::class.java)
        )
    }

    fun existePorId(id: Int): Boolean{
        val qtdExistente = jdbcTemplate.queryForObject(
            "select count(*) from filme where id = ?",
            Int::class.java,
            id
        )
        return qtdExistente > 0
    }

    fun buscarPorId(id: Int): Filme{
        return jdbcTemplate.queryForObject("" +
                "select * from filme where id = ?",
            BeanPropertyRowMapper(Filme::class.java), id)
    }

    fun atualizarPorId(id: Int, filmeParaAtualizar: Filme): Boolean{
        val qtdLinhasAfetadas = jdbcTemplate.update(
            """
                update filme filme
                nome = ?,
                genero = ?,
                anoLancamento = ?,
                duracao = ?,
                alugado = ?
                where id = ?
            """,
            filmeParaAtualizar.nome,
            filmeParaAtualizar.genero,
            filmeParaAtualizar.anoLancamento,
            filmeParaAtualizar.duracao,
            filmeParaAtualizar.alugado,
            id
        )
        return qtdLinhasAfetadas > 0
    }

    fun deletarPorId(id: Int): Boolean{
        val qtdLinhasAfetadas = jdbcTemplate.update(
            "delete from filme where id = ?",
            id
        )
        return qtdLinhasAfetadas > 0
    }

    fun alugadoPorId(id: Int): Boolean{
        val qtdLinhasAfetadas = jdbcTemplate.queryForObject(
            "select alugado from filme where id = ?",
            Boolean::class.java,
            id
        )
        return qtdLinhasAfetadas
    }

    fun alugarPorId(id: Int): Boolean{
        return jdbcTemplate.update(
            "update filme set alugado = true where id = ?",
            id
        ) > 0
    }
}