fun main(){
    val textoConst = "Texto inicial";

    //tipo inferido (tipo é definido pelo valor inicial)
    var texto = "Texto inicial";
    texto = "valor alterado";

    //tipo declarativo (tipo definido pela declaração da variavel)
    var textoDefinido: String = ""; // pode ter ou nao valor inicial mas apenas quando for declarativo

    val numero: Int = 10; // pode ter ou nao valor inicial mas apenas quando for declarativo
    val real: Double = 10.0;// pode ter ou nao valor inicial mas apenas quando for declarativo

    var aposentado: Boolean;// pode ter ou nao valor inicial mas apenas quando for declarativo
    aposentado = true;
    aposentado = false;

    aposentado.toString(); //mudando o tipo Boolean para String

    val decimalParaInteiro = real.toInt() //Decimal para inteiro
}