class Cofrinho (
    var objetivo: String = "",
    var saldo: Double = 0.0,
    var meta: Double = 0.0,
    var depositos: Int = 0
) {
    fun depositar(valorDeposito:Double){
        if(valorDeposito > 0){
            saldo += valorDeposito;
            numerosDepositos();
        }
    }

    fun retirar(valorRetirada:Double){
        if(valorRetirada > 0 && valorRetirada <= saldo){
            saldo -= valorRetirada;
        }
    }

    fun porcentagemAteMeta():Double{
        var percMeta = (saldo / meta) * 100;

        return percMeta;
    }

    fun descrever():String{
        var frase: String = ""

        if(porcentagemAteMeta() >= 100){
            frase = "O cofrinho de objetivo ${objetivo} está com R$${saldo} de saldo. Já chegou na meta, estando em ${porcentagemAteMeta()}% dela! \n";
        }else{
            frase = "O cofrinho de objetivo ${objetivo} está com R$${saldo} de saldo, estando a ${porcentagemAteMeta()}% da meta de R$${meta} \n";
        }

        return frase;
    }

    fun numerosDepositos():Int{
        depositos += 1

        return depositos;
    }


}