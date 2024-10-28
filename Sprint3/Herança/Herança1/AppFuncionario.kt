fun main() {

    var gerente = Gerente()
    var desenvolvedor = Desenvolvedor()

    println("<----- Gerente ----->")
    gerente.nome = "Claudiano"
    gerente.salario = 1500.00
    println("${gerente.nome}, você tem um bonificação de R$${gerente.calcularBonificacao()}")

    println("<----- Desenvolvedor ----->")
    desenvolvedor.nome = "Pedro"
    desenvolvedor.salario = 1500.00
    println("${desenvolvedor.nome}, você tem um bonificação de R$${desenvolvedor.calcularBonificacao()}")
}