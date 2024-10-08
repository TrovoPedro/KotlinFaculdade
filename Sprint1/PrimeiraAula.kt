fun main() {
    println("Hello World!!")

    // "var" pode ser alterado
    // "val" não pode ser alterado
    val nome1 = "Pedro"
    var nome:String = "Pedro"; //tipo declarativo
    var sobreNome = "Trovo"; //tipo inferido

    println(nome);
    println(nome+" "+sobreNome); //concatenação
    println("Bom dia $nome $sobreNome"); //interpolação
    println("Bom dia ${nome.uppercase()} ${sobreNome.uppercase()}"); //transformando o nome e sobrenome em uppercase pq Strings tem metodos

    val salario:Int = 2000;

    if(salario < 1500){
        println("Um salário mínimo")
    }else{
        println("Da pra sobreviver")
    }

    // if ternario
    val nota = 6.0;
    val resultado = if(nota < 6.0) "Reprovado" else "Aprovado"

    //when e in equivale ao switch case
    when(nota){
        1.0 -> println("Deu ruim")
        3.0 -> println("Vai levar carcada")
        in 3.1 .. 6.0 -> println("Da pra ir melhor")
        else -> print("Deu bom")
    }

    val resultadoNota = when(nota){
        1.0 -> "Deu ruim"
        3.0 -> "Vai levar carcada"
        in 3.1 .. 6.0 -> "Da pra ir melhor"
        else -> "Deu bom"
    }

    println(resultadoNota)

    var contador  = 0;

    while(contador < 10){
        println("Número: ${++contador}")// pré-incremento
    }


    for (n in 1..10){ //for no kotlin
        println(n)
    }

    for (n in 10 downTo 1){ // for decrescente
        println(n)
    }
}
