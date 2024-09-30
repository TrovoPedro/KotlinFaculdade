import org.apache.commons.dbcp2.BasicDataSource
import org.springframework.jdbc.core.BeanPropertyRowMapper
import org.springframework.jdbc.core.JdbcTemplate

class ProdutoRepositorio {

    lateinit var jdbcTemplate: JdbcTemplate

    fun configurar() {
        val datasource = BasicDataSource()
        datasource.driverClassName = "org.h2.Driver"
        datasource.url = "jdbc:h2:mem:estoque"
        datasource.username = "sa"
        datasource.password = ""

        jdbcTemplate = JdbcTemplate(datasource)
    }

    fun criarTabela() {
        jdbcTemplate.execute(
            """
        CREATE TABLE IF NOT EXISTS Produto(
            id int PRIMARY KEY AUTO_INCREMENT,
            nome varchar(255) NOT NULL,
            categoria varchar(255) NOT NULL,
            preco Double,
            fabricante varchar(255) NOT NULL
        )
    """
        )
    }

    fun inserir(novoProduto: Produto): Boolean{
        val qtdLinhasAfetadas = jdbcTemplate.update(
            """
                INSERT INTO Produto (nome, categoria, preco, fabricante) 
                VALUES(?, ?, ?, ?)
            """,
            novoProduto.nome,
            novoProduto.categoria,
            novoProduto.preco,
            novoProduto.fabricante
        )
        return qtdLinhasAfetadas > 0
    }

    fun listar(): List<Produto>{

        return jdbcTemplate.query(
            "SELECT * from Produto",
            BeanPropertyRowMapper(Produto::class.java)
        )
    }

    fun existePorId(id:Int): Boolean{
        val qtdExistentes = jdbcTemplate.queryForObject(
            "SELECT COUNT(*) FROM Produto WHERE id = ?",
            Int::class.java,
            id
        )
        return qtdExistentes > 0
    }

    fun buscarPorId(id: Int): Produto{
        val produtoExistente = jdbcTemplate.queryForObject(
            "SELECT * FROM Produto WHERE id = ?",
            BeanPropertyRowMapper(Produto::class.java),
            id
        )
        return produtoExistente
    }

    fun atualizarPorId(id: Int, produtoAtualizado: Produto): Boolean{
        val qtdLinhasAfetadas = jdbcTemplate.update(
            """
                UPDATE Produto SET
                nome = ?,
                categoria = ?,
                preco = ?,
                fabricante = ?
                WHERE id = ?
            """,

            produtoAtualizado.nome,
            produtoAtualizado.categoria,
            produtoAtualizado.preco,
            produtoAtualizado.fabricante,
            id

        )
        return qtdLinhasAfetadas > 0
    }

    fun deletarPorId(id: Int): Boolean{
        val qtdLinhaAfetadas = jdbcTemplate.update(
            "DELETE FROM Produto WHERE id = ?",
            id
        )
        return qtdLinhaAfetadas > 0
    }


}