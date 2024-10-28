class Gerente: Funcionario(){

    override fun calcularBonificacao(): Double {
        var bonificacao = salario * 0.20
        return bonificacao
    }

}