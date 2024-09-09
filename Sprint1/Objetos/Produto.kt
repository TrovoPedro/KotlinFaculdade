import java.time.LocalDate

class Produto (
    var nome: String = "",
    var preco: Double = 0.0,
    var validade: LocalDate = LocalDate.now()
){
    fun descrever():String{
        var dataAtual = LocalDate.now()

        if(validade.isBefore(dataAtual)){
            return "Produto $nome está vencido!\n";
        }
        return "Da pra mandar pra dentro\n";
    }
}