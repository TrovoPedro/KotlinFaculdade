class PedidoPizza (
    var sabor:String = "",
    var preco:Double = 0.0,
    var quantidadeAmigos:Int = 0
    ){
    var listaCupom = mutableListOf<String>();

    fun descrever():String{
        var frase = "Pedido de pizza ${sabor}, que custa R$${preco}";

        return frase;
    }

    fun validarCupom(cupom:String){
        if(cupom == "#amopizza"){
            preco = preco * 0.9;
            listaCupom.add(cupom);
        }
        listaCupom.add(cupom);
    }

    fun obterValorPorAmigo():Double{
        var valorPAmigo = preco / quantidadeAmigos;

        return valorPAmigo;
    }

    fun obterCuponsUsados():String{
        var cuponsUsados = ""

        for(i in listaCupom){
            cuponsUsados += "\n - $i"
        }

        return cuponsUsados;
    }
}