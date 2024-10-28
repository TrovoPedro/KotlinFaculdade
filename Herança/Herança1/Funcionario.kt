open class Funcionario {
    var salario: Double = 0.0
    var nome: String = ""

    open fun calcularBonificacao(): Double{
        var bonificacao = salario * 0.10

        return bonificacao
    }
}