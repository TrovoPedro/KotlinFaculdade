class Pessoa(
    val nome: String,
    val idade: Int,
) {
    fun respirar(){
        println("Respirando..."); //Encapsulamento de metodo
    }

    fun ola(){
        println("Olá meu nome é $nome e tenho $idade anos");
    }
}