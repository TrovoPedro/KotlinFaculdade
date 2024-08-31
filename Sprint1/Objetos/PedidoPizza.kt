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
        listaCupom.add(cupom);

        if(cupom == "#amopizza"){
            preco = preco * 0.9;
        }
    }

    fun obterValorPorAmigo(): String {
        var valorPAmigo = "%.2f".format(preco / quantidadeAmigos);

        return valorPAmigo;
    }

    fun obterCuponsUsados():String{
        var cuponsUsados = "";

        for(i in listaCupom){
            cuponsUsados += "\n - $i";
        }

        return cuponsUsados;
    }
}